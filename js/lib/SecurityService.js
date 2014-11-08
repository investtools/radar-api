//
// Autogenerated by Thrift Compiler (1.0.0-dev)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
var Thrift = require('thrift').Thrift;

var ttypes = require('./radar_types');
//HELPER FUNCTIONS AND STRUCTURES

Radar.API.SecurityService_short_name_args = function(args) {
  this.id = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
  }
};
Radar.API.SecurityService_short_name_args.prototype = {};
Radar.API.SecurityService_short_name_args.prototype.read = function(input) {
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
        this.id = new ttypes.SecurityId();
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

Radar.API.SecurityService_short_name_args.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_short_name_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_short_name_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
Radar.API.SecurityService_short_name_result.prototype = {};
Radar.API.SecurityService_short_name_result.prototype.read = function(input) {
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

Radar.API.SecurityService_short_name_result.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_short_name_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRING, 0);
    output.writeString(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_prices_args = function(args) {
  this.id = null;
  this.start_date = null;
  this.end_date = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
    if (args.start_date !== undefined) {
      this.start_date = args.start_date;
    }
    if (args.end_date !== undefined) {
      this.end_date = args.end_date;
    }
  }
};
Radar.API.SecurityService_prices_args.prototype = {};
Radar.API.SecurityService_prices_args.prototype.read = function(input) {
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
        this.id = new ttypes.SecurityId();
        this.id.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.start_date = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.end_date = input.readI32();
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

Radar.API.SecurityService_prices_args.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_prices_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  if (this.start_date !== null && this.start_date !== undefined) {
    output.writeFieldBegin('start_date', Thrift.Type.I32, 2);
    output.writeI32(this.start_date);
    output.writeFieldEnd();
  }
  if (this.end_date !== null && this.end_date !== undefined) {
    output.writeFieldBegin('end_date', Thrift.Type.I32, 3);
    output.writeI32(this.end_date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_prices_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
Radar.API.SecurityService_prices_result.prototype = {};
Radar.API.SecurityService_prices_result.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.LIST) {
        var _size104 = 0;
        var _rtmp3108;
        this.success = [];
        var _etype107 = 0;
        _rtmp3108 = input.readListBegin();
        _etype107 = _rtmp3108.etype;
        _size104 = _rtmp3108.size;
        for (var _i109 = 0; _i109 < _size104; ++_i109)
        {
          var elem110 = null;
          elem110 = new ttypes.Price();
          elem110.read(input);
          this.success.push(elem110);
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

Radar.API.SecurityService_prices_result.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_prices_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.LIST, 0);
    output.writeListBegin(Thrift.Type.STRUCT, this.success.length);
    for (var iter111 in this.success)
    {
      if (this.success.hasOwnProperty(iter111))
      {
        iter111 = this.success[iter111];
        iter111.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_args = function(args) {
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
Radar.API.SecurityService_price_args.prototype = {};
Radar.API.SecurityService_price_args.prototype.read = function(input) {
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
        this.id = new ttypes.SecurityId();
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

Radar.API.SecurityService_price_args.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_args');
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

Radar.API.SecurityService_price_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
Radar.API.SecurityService_price_result.prototype = {};
Radar.API.SecurityService_price_result.prototype.read = function(input) {
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

Radar.API.SecurityService_price_result.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.DOUBLE, 0);
    output.writeDouble(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_change_args = function(args) {
  this.id = null;
  this.start_date = null;
  this.end_date = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
    if (args.start_date !== undefined) {
      this.start_date = args.start_date;
    }
    if (args.end_date !== undefined) {
      this.end_date = args.end_date;
    }
  }
};
Radar.API.SecurityService_price_change_args.prototype = {};
Radar.API.SecurityService_price_change_args.prototype.read = function(input) {
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
        this.id = new ttypes.SecurityId();
        this.id.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.start_date = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.end_date = input.readI32();
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

Radar.API.SecurityService_price_change_args.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_change_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  if (this.start_date !== null && this.start_date !== undefined) {
    output.writeFieldBegin('start_date', Thrift.Type.I32, 2);
    output.writeI32(this.start_date);
    output.writeFieldEnd();
  }
  if (this.end_date !== null && this.end_date !== undefined) {
    output.writeFieldBegin('end_date', Thrift.Type.I32, 3);
    output.writeI32(this.end_date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_change_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
Radar.API.SecurityService_price_change_result.prototype = {};
Radar.API.SecurityService_price_change_result.prototype.read = function(input) {
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

Radar.API.SecurityService_price_change_result.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_change_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.DOUBLE, 0);
    output.writeDouble(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_changes_args = function(args) {
  this.id = null;
  this.start_date = null;
  this.end_date = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
    if (args.start_date !== undefined) {
      this.start_date = args.start_date;
    }
    if (args.end_date !== undefined) {
      this.end_date = args.end_date;
    }
  }
};
Radar.API.SecurityService_price_changes_args.prototype = {};
Radar.API.SecurityService_price_changes_args.prototype.read = function(input) {
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
        this.id = new ttypes.SecurityId();
        this.id.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.start_date = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.end_date = input.readI32();
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

Radar.API.SecurityService_price_changes_args.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_changes_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  if (this.start_date !== null && this.start_date !== undefined) {
    output.writeFieldBegin('start_date', Thrift.Type.I32, 2);
    output.writeI32(this.start_date);
    output.writeFieldEnd();
  }
  if (this.end_date !== null && this.end_date !== undefined) {
    output.writeFieldBegin('end_date', Thrift.Type.I32, 3);
    output.writeI32(this.end_date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_changes_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
Radar.API.SecurityService_price_changes_result.prototype = {};
Radar.API.SecurityService_price_changes_result.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.LIST) {
        var _size112 = 0;
        var _rtmp3116;
        this.success = [];
        var _etype115 = 0;
        _rtmp3116 = input.readListBegin();
        _etype115 = _rtmp3116.etype;
        _size112 = _rtmp3116.size;
        for (var _i117 = 0; _i117 < _size112; ++_i117)
        {
          var elem118 = null;
          elem118 = input.readDouble();
          this.success.push(elem118);
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

Radar.API.SecurityService_price_changes_result.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_changes_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.LIST, 0);
    output.writeListBegin(Thrift.Type.DOUBLE, this.success.length);
    for (var iter119 in this.success)
    {
      if (this.success.hasOwnProperty(iter119))
      {
        iter119 = this.success[iter119];
        output.writeDouble(iter119);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_volatility_args = function(args) {
  this.id = null;
  this.start_date = null;
  this.end_date = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    }
    if (args.start_date !== undefined) {
      this.start_date = args.start_date;
    }
    if (args.end_date !== undefined) {
      this.end_date = args.end_date;
    }
  }
};
Radar.API.SecurityService_price_volatility_args.prototype = {};
Radar.API.SecurityService_price_volatility_args.prototype.read = function(input) {
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
        this.id = new ttypes.SecurityId();
        this.id.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.start_date = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.end_date = input.readI32();
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

Radar.API.SecurityService_price_volatility_args.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_volatility_args');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRUCT, 1);
    this.id.write(output);
    output.writeFieldEnd();
  }
  if (this.start_date !== null && this.start_date !== undefined) {
    output.writeFieldBegin('start_date', Thrift.Type.I32, 2);
    output.writeI32(this.start_date);
    output.writeFieldEnd();
  }
  if (this.end_date !== null && this.end_date !== undefined) {
    output.writeFieldBegin('end_date', Thrift.Type.I32, 3);
    output.writeI32(this.end_date);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityService_price_volatility_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined) {
      this.success = args.success;
    }
  }
};
Radar.API.SecurityService_price_volatility_result.prototype = {};
Radar.API.SecurityService_price_volatility_result.prototype.read = function(input) {
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

Radar.API.SecurityService_price_volatility_result.prototype.write = function(output) {
  output.writeStructBegin('SecurityService_price_volatility_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.DOUBLE, 0);
    output.writeDouble(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

Radar.API.SecurityServiceClient = exports.Client = function(output, pClass) {
    this.output = output;
    this.pClass = pClass;
    this._seqid = 0;
    this._reqs = {};
};
Radar.API.SecurityServiceClient.prototype = {};
Radar.API.SecurityServiceClient.prototype.seqid = function() { return this._seqid; }
Radar.API.SecurityServiceClient.prototype.new_seqid = function() { return this._seqid += 1; }
Radar.API.SecurityServiceClient.prototype.short_name = function(id, callback) {
  this._seqid = this.new_seqid();
  this._reqs[this.seqid()] = callback;
  this.send_short_name(id);
};

Radar.API.SecurityServiceClient.prototype.send_short_name = function(id) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('short_name', Thrift.MessageType.CALL, this.seqid());
  var args = new Radar.API.SecurityService_short_name_args();
  args.id = id;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

Radar.API.SecurityServiceClient.prototype.recv_short_name = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new Radar.API.SecurityService_short_name_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('short_name failed: unknown result');
};
Radar.API.SecurityServiceClient.prototype.prices = function(id, start_date, end_date, callback) {
  this._seqid = this.new_seqid();
  this._reqs[this.seqid()] = callback;
  this.send_prices(id, start_date, end_date);
};

Radar.API.SecurityServiceClient.prototype.send_prices = function(id, start_date, end_date) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('prices', Thrift.MessageType.CALL, this.seqid());
  var args = new Radar.API.SecurityService_prices_args();
  args.id = id;
  args.start_date = start_date;
  args.end_date = end_date;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

Radar.API.SecurityServiceClient.prototype.recv_prices = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new Radar.API.SecurityService_prices_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('prices failed: unknown result');
};
Radar.API.SecurityServiceClient.prototype.price = function(id, date, callback) {
  this._seqid = this.new_seqid();
  this._reqs[this.seqid()] = callback;
  this.send_price(id, date);
};

Radar.API.SecurityServiceClient.prototype.send_price = function(id, date) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('price', Thrift.MessageType.CALL, this.seqid());
  var args = new Radar.API.SecurityService_price_args();
  args.id = id;
  args.date = date;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

Radar.API.SecurityServiceClient.prototype.recv_price = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new Radar.API.SecurityService_price_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('price failed: unknown result');
};
Radar.API.SecurityServiceClient.prototype.price_change = function(id, start_date, end_date, callback) {
  this._seqid = this.new_seqid();
  this._reqs[this.seqid()] = callback;
  this.send_price_change(id, start_date, end_date);
};

Radar.API.SecurityServiceClient.prototype.send_price_change = function(id, start_date, end_date) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('price_change', Thrift.MessageType.CALL, this.seqid());
  var args = new Radar.API.SecurityService_price_change_args();
  args.id = id;
  args.start_date = start_date;
  args.end_date = end_date;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

Radar.API.SecurityServiceClient.prototype.recv_price_change = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new Radar.API.SecurityService_price_change_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('price_change failed: unknown result');
};
Radar.API.SecurityServiceClient.prototype.price_changes = function(id, start_date, end_date, callback) {
  this._seqid = this.new_seqid();
  this._reqs[this.seqid()] = callback;
  this.send_price_changes(id, start_date, end_date);
};

Radar.API.SecurityServiceClient.prototype.send_price_changes = function(id, start_date, end_date) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('price_changes', Thrift.MessageType.CALL, this.seqid());
  var args = new Radar.API.SecurityService_price_changes_args();
  args.id = id;
  args.start_date = start_date;
  args.end_date = end_date;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

Radar.API.SecurityServiceClient.prototype.recv_price_changes = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new Radar.API.SecurityService_price_changes_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('price_changes failed: unknown result');
};
Radar.API.SecurityServiceClient.prototype.price_volatility = function(id, start_date, end_date, callback) {
  this._seqid = this.new_seqid();
  this._reqs[this.seqid()] = callback;
  this.send_price_volatility(id, start_date, end_date);
};

Radar.API.SecurityServiceClient.prototype.send_price_volatility = function(id, start_date, end_date) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('price_volatility', Thrift.MessageType.CALL, this.seqid());
  var args = new Radar.API.SecurityService_price_volatility_args();
  args.id = id;
  args.start_date = start_date;
  args.end_date = end_date;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

Radar.API.SecurityServiceClient.prototype.recv_price_volatility = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new Radar.API.SecurityService_price_volatility_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('price_volatility failed: unknown result');
};
Radar.API.SecurityServiceProcessor = exports.Processor = function(handler) {
  this._handler = handler
}
Radar.API.SecurityServiceProcessor.prototype.process = function(input, output) {
  var r = input.readMessageBegin();
  if (this['process_' + r.fname]) {
    return this['process_' + r.fname].call(this, r.rseqid, input, output);
  } else {
    input.skip(Thrift.Type.STRUCT);
    input.readMessageEnd();
    var x = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN_METHOD, 'Unknown function ' + r.fname);
    output.writeMessageBegin(r.fname, Thrift.MessageType.Exception, r.rseqid);
    x.write(output);
    output.writeMessageEnd();
    output.flush();
  }
}

Radar.API.SecurityServiceProcessor.prototype.process_short_name = function(seqid, input, output) {
  var args = new Radar.API.SecurityService_short_name_args();
  args.read(input);
  input.readMessageEnd();
  this._handler.short_name(args.id, function (err, result) {
    var result = new Radar.API.SecurityService_short_name_result((err != null ? err : {success: result}));
    output.writeMessageBegin("short_name", Thrift.MessageType.REPLY, seqid);
    result.write(output);
    output.writeMessageEnd();
    output.flush();
  })
}

Radar.API.SecurityServiceProcessor.prototype.process_prices = function(seqid, input, output) {
  var args = new Radar.API.SecurityService_prices_args();
  args.read(input);
  input.readMessageEnd();
  this._handler.prices(args.id, args.start_date, args.end_date, function (err, result) {
    var result = new Radar.API.SecurityService_prices_result((err != null ? err : {success: result}));
    output.writeMessageBegin("prices", Thrift.MessageType.REPLY, seqid);
    result.write(output);
    output.writeMessageEnd();
    output.flush();
  })
}

Radar.API.SecurityServiceProcessor.prototype.process_price = function(seqid, input, output) {
  var args = new Radar.API.SecurityService_price_args();
  args.read(input);
  input.readMessageEnd();
  this._handler.price(args.id, args.date, function (err, result) {
    var result = new Radar.API.SecurityService_price_result((err != null ? err : {success: result}));
    output.writeMessageBegin("price", Thrift.MessageType.REPLY, seqid);
    result.write(output);
    output.writeMessageEnd();
    output.flush();
  })
}

Radar.API.SecurityServiceProcessor.prototype.process_price_change = function(seqid, input, output) {
  var args = new Radar.API.SecurityService_price_change_args();
  args.read(input);
  input.readMessageEnd();
  this._handler.price_change(args.id, args.start_date, args.end_date, function (err, result) {
    var result = new Radar.API.SecurityService_price_change_result((err != null ? err : {success: result}));
    output.writeMessageBegin("price_change", Thrift.MessageType.REPLY, seqid);
    result.write(output);
    output.writeMessageEnd();
    output.flush();
  })
}

Radar.API.SecurityServiceProcessor.prototype.process_price_changes = function(seqid, input, output) {
  var args = new Radar.API.SecurityService_price_changes_args();
  args.read(input);
  input.readMessageEnd();
  this._handler.price_changes(args.id, args.start_date, args.end_date, function (err, result) {
    var result = new Radar.API.SecurityService_price_changes_result((err != null ? err : {success: result}));
    output.writeMessageBegin("price_changes", Thrift.MessageType.REPLY, seqid);
    result.write(output);
    output.writeMessageEnd();
    output.flush();
  })
}

Radar.API.SecurityServiceProcessor.prototype.process_price_volatility = function(seqid, input, output) {
  var args = new Radar.API.SecurityService_price_volatility_args();
  args.read(input);
  input.readMessageEnd();
  this._handler.price_volatility(args.id, args.start_date, args.end_date, function (err, result) {
    var result = new Radar.API.SecurityService_price_volatility_result((err != null ? err : {success: result}));
    output.writeMessageBegin("price_volatility", Thrift.MessageType.REPLY, seqid);
    result.write(output);
    output.writeMessageEnd();
    output.flush();
  })
}

