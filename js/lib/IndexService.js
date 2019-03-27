//
// Autogenerated by Thrift Compiler (0.12.0)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
"use strict";

var thrift = require('thrift');
var Thrift = thrift.Thrift;
var Q = thrift.Q;

var common_ttypes = require('./common_types');
var transaction_ttypes = require('./transaction_types');


var ttypes = require('./data_server_types');
//HELPER FUNCTIONS AND STRUCTURES

var IndexService_prices_args = function(args) {
  this.symbol = null;
  this.start_date = null;
  this.end_date = null;
  if (args) {
    if (args.symbol !== undefined && args.symbol !== null) {
      this.symbol = args.symbol;
    }
    if (args.start_date !== undefined && args.start_date !== null) {
      this.start_date = args.start_date;
    }
    if (args.end_date !== undefined && args.end_date !== null) {
      this.end_date = args.end_date;
    }
  }
};
IndexService_prices_args.prototype = {};
IndexService_prices_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.symbol = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I64) {
        this.start_date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.end_date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

IndexService_prices_args.prototype.write = function(output) {
  output.writeStructBegin('IndexService_prices_args');
  if (this.symbol !== null && this.symbol !== undefined) {
    output.writeFieldBegin('symbol', Thrift.Type.STRING, 1);
    output.writeString(this.symbol);
    output.writeFieldEnd();
  }
  if (this.start_date !== null && this.start_date !== undefined) {
    output.writeFieldBegin('start_date', Thrift.Type.I64, 2);
    output.writeI64(this.start_date);
    output.writeFieldEnd();
  }
  if (this.end_date !== null && this.end_date !== undefined) {
    output.writeFieldBegin('end_date', Thrift.Type.I64, 3);
    output.writeI64(this.end_date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var IndexService_prices_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = Thrift.copyList(args.success, [ttypes.Price]);
    }
  }
};
IndexService_prices_result.prototype = {};
IndexService_prices_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 0:
      if (ftype == Thrift.Type.LIST) {
        this.success = [];
        var _rtmp336 = input.readListBegin();
        var _size35 = _rtmp336.size || 0;
        for (var _i37 = 0; _i37 < _size35; ++_i37) {
          var elem38 = null;
          elem38 = new ttypes.Price();
          elem38.read(input);
          this.success.push(elem38);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

IndexService_prices_result.prototype.write = function(output) {
  output.writeStructBegin('IndexService_prices_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.LIST, 0);
    output.writeListBegin(Thrift.Type.STRUCT, this.success.length);
    for (var iter39 in this.success) {
      if (this.success.hasOwnProperty(iter39)) {
        iter39 = this.success[iter39];
        iter39.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var IndexService_price_args = function(args) {
  this.symbol = null;
  this.date = null;
  if (args) {
    if (args.symbol !== undefined && args.symbol !== null) {
      this.symbol = args.symbol;
    }
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
  }
};
IndexService_price_args.prototype = {};
IndexService_price_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.symbol = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

IndexService_price_args.prototype.write = function(output) {
  output.writeStructBegin('IndexService_price_args');
  if (this.symbol !== null && this.symbol !== undefined) {
    output.writeFieldBegin('symbol', Thrift.Type.STRING, 1);
    output.writeString(this.symbol);
    output.writeFieldEnd();
  }
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 2);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var IndexService_price_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = args.success;
    }
  }
};
IndexService_price_result.prototype = {};
IndexService_price_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 0:
      if (ftype == Thrift.Type.DOUBLE) {
        this.success = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

IndexService_price_result.prototype.write = function(output) {
  output.writeStructBegin('IndexService_price_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.DOUBLE, 0);
    output.writeDouble(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var IndexService_price_change_args = function(args) {
  this.symbol = null;
  this.start_date = null;
  this.end_date = null;
  if (args) {
    if (args.symbol !== undefined && args.symbol !== null) {
      this.symbol = args.symbol;
    }
    if (args.start_date !== undefined && args.start_date !== null) {
      this.start_date = args.start_date;
    }
    if (args.end_date !== undefined && args.end_date !== null) {
      this.end_date = args.end_date;
    }
  }
};
IndexService_price_change_args.prototype = {};
IndexService_price_change_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.symbol = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I64) {
        this.start_date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.end_date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

IndexService_price_change_args.prototype.write = function(output) {
  output.writeStructBegin('IndexService_price_change_args');
  if (this.symbol !== null && this.symbol !== undefined) {
    output.writeFieldBegin('symbol', Thrift.Type.STRING, 1);
    output.writeString(this.symbol);
    output.writeFieldEnd();
  }
  if (this.start_date !== null && this.start_date !== undefined) {
    output.writeFieldBegin('start_date', Thrift.Type.I64, 2);
    output.writeI64(this.start_date);
    output.writeFieldEnd();
  }
  if (this.end_date !== null && this.end_date !== undefined) {
    output.writeFieldBegin('end_date', Thrift.Type.I64, 3);
    output.writeI64(this.end_date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var IndexService_price_change_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = args.success;
    }
  }
};
IndexService_price_change_result.prototype = {};
IndexService_price_change_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true) {
    var ret = input.readFieldBegin();
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid) {
      case 0:
      if (ftype == Thrift.Type.DOUBLE) {
        this.success = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

IndexService_price_change_result.prototype.write = function(output) {
  output.writeStructBegin('IndexService_price_change_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.DOUBLE, 0);
    output.writeDouble(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var IndexServiceClient = exports.Client = function(output, pClass) {
  this.output = output;
  this.pClass = pClass;
  this._seqid = 0;
  this._reqs = {};
};
IndexServiceClient.prototype = {};
IndexServiceClient.prototype.seqid = function() { return this._seqid; };
IndexServiceClient.prototype.new_seqid = function() { return this._seqid += 1; };

IndexServiceClient.prototype.prices = function(symbol, start_date, end_date, callback) {
  this._seqid = this.new_seqid();
  if (callback === undefined) {
    var _defer = Q.defer();
    this._reqs[this.seqid()] = function(error, result) {
      if (error) {
        _defer.reject(error);
      } else {
        _defer.resolve(result);
      }
    };
    this.send_prices(symbol, start_date, end_date);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_prices(symbol, start_date, end_date);
  }
};

IndexServiceClient.prototype.send_prices = function(symbol, start_date, end_date) {
  var output = new this.pClass(this.output);
  var params = {
    symbol: symbol,
    start_date: start_date,
    end_date: end_date
  };
  var args = new IndexService_prices_args(params);
  try {
    output.writeMessageBegin('prices', Thrift.MessageType.CALL, this.seqid());
    args.write(output);
    output.writeMessageEnd();
    return this.output.flush();
  }
  catch (e) {
    delete this._reqs[this.seqid()];
    if (typeof output.reset === 'function') {
      output.reset();
    }
    throw e;
  }
};

IndexServiceClient.prototype.recv_prices = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new IndexService_prices_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('prices failed: unknown result');
};

IndexServiceClient.prototype.price = function(symbol, date, callback) {
  this._seqid = this.new_seqid();
  if (callback === undefined) {
    var _defer = Q.defer();
    this._reqs[this.seqid()] = function(error, result) {
      if (error) {
        _defer.reject(error);
      } else {
        _defer.resolve(result);
      }
    };
    this.send_price(symbol, date);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_price(symbol, date);
  }
};

IndexServiceClient.prototype.send_price = function(symbol, date) {
  var output = new this.pClass(this.output);
  var params = {
    symbol: symbol,
    date: date
  };
  var args = new IndexService_price_args(params);
  try {
    output.writeMessageBegin('price', Thrift.MessageType.CALL, this.seqid());
    args.write(output);
    output.writeMessageEnd();
    return this.output.flush();
  }
  catch (e) {
    delete this._reqs[this.seqid()];
    if (typeof output.reset === 'function') {
      output.reset();
    }
    throw e;
  }
};

IndexServiceClient.prototype.recv_price = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new IndexService_price_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('price failed: unknown result');
};

IndexServiceClient.prototype.price_change = function(symbol, start_date, end_date, callback) {
  this._seqid = this.new_seqid();
  if (callback === undefined) {
    var _defer = Q.defer();
    this._reqs[this.seqid()] = function(error, result) {
      if (error) {
        _defer.reject(error);
      } else {
        _defer.resolve(result);
      }
    };
    this.send_price_change(symbol, start_date, end_date);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_price_change(symbol, start_date, end_date);
  }
};

IndexServiceClient.prototype.send_price_change = function(symbol, start_date, end_date) {
  var output = new this.pClass(this.output);
  var params = {
    symbol: symbol,
    start_date: start_date,
    end_date: end_date
  };
  var args = new IndexService_price_change_args(params);
  try {
    output.writeMessageBegin('price_change', Thrift.MessageType.CALL, this.seqid());
    args.write(output);
    output.writeMessageEnd();
    return this.output.flush();
  }
  catch (e) {
    delete this._reqs[this.seqid()];
    if (typeof output.reset === 'function') {
      output.reset();
    }
    throw e;
  }
};

IndexServiceClient.prototype.recv_price_change = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new IndexService_price_change_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('price_change failed: unknown result');
};
var IndexServiceProcessor = exports.Processor = function(handler) {
  this._handler = handler;
};
IndexServiceProcessor.prototype.process = function(input, output) {
  var r = input.readMessageBegin();
  if (this['process_' + r.fname]) {
    return this['process_' + r.fname].call(this, r.rseqid, input, output);
  } else {
    input.skip(Thrift.Type.STRUCT);
    input.readMessageEnd();
    var x = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN_METHOD, 'Unknown function ' + r.fname);
    output.writeMessageBegin(r.fname, Thrift.MessageType.EXCEPTION, r.rseqid);
    x.write(output);
    output.writeMessageEnd();
    output.flush();
  }
};
IndexServiceProcessor.prototype.process_prices = function(seqid, input, output) {
  var args = new IndexService_prices_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.prices.length === 3) {
    Q.fcall(this._handler.prices.bind(this._handler),
      args.symbol,
      args.start_date,
      args.end_date
    ).then(function(result) {
      var result_obj = new IndexService_prices_result({success: result});
      output.writeMessageBegin("prices", Thrift.MessageType.REPLY, seqid);
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    }).catch(function (err) {
      var result;
      result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
      output.writeMessageBegin("prices", Thrift.MessageType.EXCEPTION, seqid);
      result.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  } else {
    this._handler.prices(args.symbol, args.start_date, args.end_date, function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined')) {
        result_obj = new IndexService_prices_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("prices", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("prices", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
IndexServiceProcessor.prototype.process_price = function(seqid, input, output) {
  var args = new IndexService_price_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.price.length === 2) {
    Q.fcall(this._handler.price.bind(this._handler),
      args.symbol,
      args.date
    ).then(function(result) {
      var result_obj = new IndexService_price_result({success: result});
      output.writeMessageBegin("price", Thrift.MessageType.REPLY, seqid);
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    }).catch(function (err) {
      var result;
      result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
      output.writeMessageBegin("price", Thrift.MessageType.EXCEPTION, seqid);
      result.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  } else {
    this._handler.price(args.symbol, args.date, function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined')) {
        result_obj = new IndexService_price_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("price", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("price", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
IndexServiceProcessor.prototype.process_price_change = function(seqid, input, output) {
  var args = new IndexService_price_change_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.price_change.length === 3) {
    Q.fcall(this._handler.price_change.bind(this._handler),
      args.symbol,
      args.start_date,
      args.end_date
    ).then(function(result) {
      var result_obj = new IndexService_price_change_result({success: result});
      output.writeMessageBegin("price_change", Thrift.MessageType.REPLY, seqid);
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    }).catch(function (err) {
      var result;
      result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
      output.writeMessageBegin("price_change", Thrift.MessageType.EXCEPTION, seqid);
      result.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  } else {
    this._handler.price_change(args.symbol, args.start_date, args.end_date, function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined')) {
        result_obj = new IndexService_price_change_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("price_change", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("price_change", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
