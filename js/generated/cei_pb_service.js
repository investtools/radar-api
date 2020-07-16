// package: 
// file: cei.proto

var cei_pb = require("./cei_pb");
var grpc = require("@improbable-eng/grpc-web").grpc;

var CaptchaCracker = (function () {
  function CaptchaCracker() {}
  CaptchaCracker.serviceName = "CaptchaCracker";
  return CaptchaCracker;
}());

CaptchaCracker.Solve = {
  methodName: "Solve",
  service: CaptchaCracker,
  requestStream: false,
  responseStream: false,
  requestType: cei_pb.SolveReq,
  responseType: cei_pb.SolveResp
};

exports.CaptchaCracker = CaptchaCracker;

function CaptchaCrackerClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

CaptchaCrackerClient.prototype.solve = function solve(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(CaptchaCracker.Solve, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

exports.CaptchaCrackerClient = CaptchaCrackerClient;

var Account = (function () {
  function Account() {}
  Account.serviceName = "Account";
  return Account;
}());

Account.Authenticate = {
  methodName: "Authenticate",
  service: Account,
  requestStream: false,
  responseStream: false,
  requestType: cei_pb.AuthenticateReq,
  responseType: cei_pb.AuthenticateResp
};

Account.VerifyAccount = {
  methodName: "VerifyAccount",
  service: Account,
  requestStream: false,
  responseStream: false,
  requestType: cei_pb.VerifyAccountReq,
  responseType: cei_pb.VerifyAccountResp
};

Account.RecoverPassword = {
  methodName: "RecoverPassword",
  service: Account,
  requestStream: false,
  responseStream: false,
  requestType: cei_pb.RecoverPasswordReq,
  responseType: cei_pb.RecoverPasswordResp
};

Account.DefinePermanentPassword = {
  methodName: "DefinePermanentPassword",
  service: Account,
  requestStream: false,
  responseStream: false,
  requestType: cei_pb.DefinePermanentPasswordReq,
  responseType: cei_pb.DefinePermanentPasswordResp
};

exports.Account = Account;

function AccountClient(serviceHost, options) {
  this.serviceHost = serviceHost;
  this.options = options || {};
}

AccountClient.prototype.authenticate = function authenticate(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(Account.Authenticate, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

AccountClient.prototype.verifyAccount = function verifyAccount(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(Account.VerifyAccount, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

AccountClient.prototype.recoverPassword = function recoverPassword(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(Account.RecoverPassword, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

AccountClient.prototype.definePermanentPassword = function definePermanentPassword(requestMessage, metadata, callback) {
  if (arguments.length === 2) {
    callback = arguments[1];
  }
  var client = grpc.unary(Account.DefinePermanentPassword, {
    request: requestMessage,
    host: this.serviceHost,
    metadata: metadata,
    transport: this.options.transport,
    debug: this.options.debug,
    onEnd: function (response) {
      if (callback) {
        if (response.status !== grpc.Code.OK) {
          var err = new Error(response.statusMessage);
          err.code = response.status;
          err.metadata = response.trailers;
          callback(err, null);
        } else {
          callback(null, response.message);
        }
      }
    }
  });
  return {
    cancel: function () {
      callback = null;
      client.close();
    }
  };
};

exports.AccountClient = AccountClient;

