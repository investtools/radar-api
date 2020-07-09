// package: Radar
// file: portfolios.proto

var portfolios_pb = require("./portfolios_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var Portfolios = (function () {
  function Portfolios() {}
  Portfolios.serviceName = "Radar.Portfolios";
  return Portfolios;
}());

Portfolios.Run = {
  methodName: "Run",
  service: Portfolios,
  requestStream: false,
  responseStream: true,
  requestType: portfolios_pb.RunReq,
  responseType: portfolios_pb.Event
};

exports.Portfolios = Portfolios;

function PortfoliosClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

PortfoliosClient.prototype.run = function run(requestMessage, metadata) {
  var listeners = {
    data: [],
    end: [],
    status: []
  };
  var client = grpc.invoke(Portfolios.Run, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onMessage: function (responseMessage) {
      listeners.data.forEach(function (handler) {
        handler(responseMessage);
      });
    },
    onEnd: function (status, statusMessage, trailers) {
      listeners.status.forEach(function (handler) {
        handler({ code: status, details: statusMessage, metadata: trailers });
      });
      listeners.end.forEach(function (handler) {
        handler({ code: status, details: statusMessage, metadata: trailers });
      });
      listeners = null;
    }
  });
  return {
    on: function (type, handler) {
      listeners[type].push(handler);
      return this;
    },
    cancel: function () {
      listeners = null;
      client.close();
    }
  };
};

exports.PortfoliosClient = PortfoliosClient;

