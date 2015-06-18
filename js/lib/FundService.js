//
// Autogenerated by Thrift Compiler (0.9.2)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
var thrift = require('thrift');
var Thrift = thrift.Thrift;
var Q = thrift.Q;

var common_ttypes = require('./common_types')


var ttypes = require('./data_server_types');
//HELPER FUNCTIONS AND STRUCTURES

FundService_name_args = function(args) {
  this.id = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
  }
};
FundService_name_args.prototype = {};
FundService_name_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.id = new common_ttypes.FundId();
        this.id.read(input);
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

FundService_name_args.prototype.write = function(output) {
  output.writeStructBegin('FundService_name_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FundService_name_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
FundService_name_result.prototype = {};
FundService_name_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
      if (ftype == Thrift.Type.STRING) {
        this.success = input.readString();
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

FundService_name_result.prototype.write = function(output) {
  output.writeStructBegin('FundService_name_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRING, 0);
    output.writeString(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FundService_short_name_args = function(args) {
  this.id = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
  }
};
FundService_short_name_args.prototype = {};
FundService_short_name_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.id = new common_ttypes.FundId();
        this.id.read(input);
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

FundService_short_name_args.prototype.write = function(output) {
  output.writeStructBegin('FundService_short_name_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FundService_short_name_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
FundService_short_name_result.prototype = {};
FundService_short_name_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
      if (ftype == Thrift.Type.STRING) {
        this.success = input.readString();
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

FundService_short_name_result.prototype.write = function(output) {
  output.writeStructBegin('FundService_short_name_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRING, 0);
    output.writeString(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FundService_daily_data_args = function(args) {
  this.id = null;
  this.date = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
    if (args.date !== undefined) {
      this.date = args.date;
    }
  }
};
FundService_daily_data_args.prototype = {};
FundService_daily_data_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.id = new common_ttypes.FundId();
        this.id.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.date = input.readI32();
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

FundService_daily_data_args.prototype.write = function(output) {
  output.writeStructBegin('FundService_daily_data_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I32, 2);
    output.writeI32(this.date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FundService_daily_data_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
FundService_daily_data_result.prototype = {};
FundService_daily_data_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
      if (ftype == Thrift.Type.STRUCT) {
        this.success = new ttypes.DailyFundData();
        this.success.read(input);
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

FundService_daily_data_result.prototype.write = function(output) {
  output.writeStructBegin('FundService_daily_data_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRUCT, 0);
    this.success.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

FundServiceClient = exports.Client = function(output, pClass) {
    this.output = output;
    this.pClass = pClass;
    this._seqid = 0;
    this._reqs = {};
};
FundServiceClient.prototype = {};
FundServiceClient.prototype.seqid = function() { return this._seqid; }
FundServiceClient.prototype.new_seqid = function() { return this._seqid += 1; }
FundServiceClient.prototype.name = function(id, callback) {
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
    this.send_name(id);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_name(id);
  }
};

FundServiceClient.prototype.send_name = function(id) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('name', Thrift.MessageType.CALL, this.seqid());
  var args = new FundService_name_args();
  args.id = id;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

FundServiceClient.prototype.recv_name = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new FundService_name_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('name failed: unknown result');
};
FundServiceClient.prototype.short_name = function(id, callback) {
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
    this.send_short_name(id);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_short_name(id);
  }
};

FundServiceClient.prototype.send_short_name = function(id) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('short_name', Thrift.MessageType.CALL, this.seqid());
  var args = new FundService_short_name_args();
  args.id = id;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

FundServiceClient.prototype.recv_short_name = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new FundService_short_name_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('short_name failed: unknown result');
};
FundServiceClient.prototype.daily_data = function(id, date, callback) {
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
    this.send_daily_data(id, date);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_daily_data(id, date);
  }
};

FundServiceClient.prototype.send_daily_data = function(id, date) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('daily_data', Thrift.MessageType.CALL, this.seqid());
  var args = new FundService_daily_data_args();
  args.id = id;
  args.date = date;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

FundServiceClient.prototype.recv_daily_data = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new FundService_daily_data_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('daily_data failed: unknown result');
};
FundServiceProcessor = exports.Processor = function(handler) {
  this._handler = handler
}
FundServiceProcessor.prototype.process = function(input, output) {
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
}

FundServiceProcessor.prototype.process_name = function(seqid, input, output) {
  var args = new FundService_name_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.name.length === 1) {
    Q.fcall(this._handler.name, args.id)
      .then(function(result) {
        var result = new FundService_name_result({success: result});
        output.writeMessageBegin("name", Thrift.MessageType.REPLY, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result = new FundService_name_result(err);
        output.writeMessageBegin("name", Thrift.MessageType.REPLY, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.name(args.id,  function (err, result) {
      var result = new FundService_name_result((err != null ? err : {success: result}));
      output.writeMessageBegin("name", Thrift.MessageType.REPLY, seqid);
      result.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
}

FundServiceProcessor.prototype.process_short_name = function(seqid, input, output) {
  var args = new FundService_short_name_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.short_name.length === 1) {
    Q.fcall(this._handler.short_name, args.id)
      .then(function(result) {
        var result = new FundService_short_name_result({success: result});
        output.writeMessageBegin("short_name", Thrift.MessageType.REPLY, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result = new FundService_short_name_result(err);
        output.writeMessageBegin("short_name", Thrift.MessageType.REPLY, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.short_name(args.id,  function (err, result) {
      var result = new FundService_short_name_result((err != null ? err : {success: result}));
      output.writeMessageBegin("short_name", Thrift.MessageType.REPLY, seqid);
      result.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
}

FundServiceProcessor.prototype.process_daily_data = function(seqid, input, output) {
  var args = new FundService_daily_data_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.daily_data.length === 2) {
    Q.fcall(this._handler.daily_data, args.id, args.date)
      .then(function(result) {
        var result = new FundService_daily_data_result({success: result});
        output.writeMessageBegin("daily_data", Thrift.MessageType.REPLY, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result = new FundService_daily_data_result(err);
        output.writeMessageBegin("daily_data", Thrift.MessageType.REPLY, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.daily_data(args.id, args.date,  function (err, result) {
      var result = new FundService_daily_data_result((err != null ? err : {success: result}));
      output.writeMessageBegin("daily_data", Thrift.MessageType.REPLY, seqid);
      result.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
}

