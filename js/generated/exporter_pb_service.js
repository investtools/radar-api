// package: Radar
// file: exporter.proto

var exporter_pb = require("./exporter_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var ReportGenerator = (function () {
  function ReportGenerator() {}
  ReportGenerator.serviceName = "Radar.ReportGenerator";
  return ReportGenerator;
}());

ReportGenerator.Generate = {
  methodName: "Generate",
  service: ReportGenerator,
  requestStream: false,
  responseStream: true,
  requestType: exporter_pb.GenerateReq,
  responseType: exporter_pb.GenerateResp
};

exports.ReportGenerator = ReportGenerator;

function ReportGeneratorClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

ReportGeneratorClient.prototype.generate = function generate(requestMessage, metadata) {
  var listeners = {
    data: [],
    end: [],
    status: []
  };
  var client = grpc.invoke(ReportGenerator.Generate, {
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

exports.ReportGeneratorClient = ReportGeneratorClient;

