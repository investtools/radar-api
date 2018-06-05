//
// Autogenerated by Thrift Compiler (0.10.0)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
"use strict";

var thrift = require('thrift');
var Thrift = thrift.Thrift;
var Q = thrift.Q;

var common_ttypes = require('./common_types');
var transaction_ttypes = require('./transaction_types');
var portfolio_ttypes = require('./portfolio_types');


var ttypes = require('./transaction_importer_types');
//HELPER FUNCTIONS AND STRUCTURES

var TransactionImporter_name_args = function(args) {
};
TransactionImporter_name_args.prototype = {};
TransactionImporter_name_args.prototype.read = function(input) {
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
    input.skip(ftype);
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

TransactionImporter_name_args.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_name_args');
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_name_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = args.success;
    }
  }
};
TransactionImporter_name_result.prototype = {};
TransactionImporter_name_result.prototype.read = function(input) {
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

TransactionImporter_name_result.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_name_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRING, 0);
    output.writeString(this.success);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_accounts_args = function(args) {
  this.username = null;
  this.password = null;
  if (args) {
    if (args.username !== undefined && args.username !== null) {
      this.username = args.username;
    }
    if (args.password !== undefined && args.password !== null) {
      this.password = args.password;
    }
  }
};
TransactionImporter_accounts_args.prototype = {};
TransactionImporter_accounts_args.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.STRING) {
        this.username = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.password = input.readString();
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

TransactionImporter_accounts_args.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_accounts_args');
  if (this.username !== null && this.username !== undefined) {
    output.writeFieldBegin('username', Thrift.Type.STRING, 1);
    output.writeString(this.username);
    output.writeFieldEnd();
  }
  if (this.password !== null && this.password !== undefined) {
    output.writeFieldBegin('password', Thrift.Type.STRING, 2);
    output.writeString(this.password);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_accounts_result = function(args) {
  this.success = null;
  this.auth_error = null;
  this.system_unavailable = null;
  if (args instanceof ttypes.AuthenticationError) {
    this.auth_error = args;
    return;
  }
  if (args instanceof ttypes.SystemUnavailableError) {
    this.system_unavailable = args;
    return;
  }
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = Thrift.copyMap(args.success, [null]);
    }
    if (args.auth_error !== undefined && args.auth_error !== null) {
      this.auth_error = args.auth_error;
    }
    if (args.system_unavailable !== undefined && args.system_unavailable !== null) {
      this.system_unavailable = args.system_unavailable;
    }
  }
};
TransactionImporter_accounts_result.prototype = {};
TransactionImporter_accounts_result.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.MAP) {
        var _size0 = 0;
        var _rtmp34;
        this.success = {};
        var _ktype1 = 0;
        var _vtype2 = 0;
        _rtmp34 = input.readMapBegin();
        _ktype1 = _rtmp34.ktype;
        _vtype2 = _rtmp34.vtype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var key6 = null;
          var val7 = null;
          key6 = input.readString();
          val7 = input.readString();
          this.success[key6] = val7;
        }
        input.readMapEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.auth_error = new ttypes.AuthenticationError();
        this.auth_error.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.system_unavailable = new ttypes.SystemUnavailableError();
        this.system_unavailable.read(input);
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

TransactionImporter_accounts_result.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_accounts_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.MAP, 0);
    output.writeMapBegin(Thrift.Type.STRING, Thrift.Type.STRING, Thrift.objectLength(this.success));
    for (var kiter8 in this.success)
    {
      if (this.success.hasOwnProperty(kiter8))
      {
        var viter9 = this.success[kiter8];
        output.writeString(kiter8);
        output.writeString(viter9);
      }
    }
    output.writeMapEnd();
    output.writeFieldEnd();
  }
  if (this.auth_error !== null && this.auth_error !== undefined) {
    output.writeFieldBegin('auth_error', Thrift.Type.STRUCT, 1);
    this.auth_error.write(output);
    output.writeFieldEnd();
  }
  if (this.system_unavailable !== null && this.system_unavailable !== undefined) {
    output.writeFieldBegin('system_unavailable', Thrift.Type.STRUCT, 2);
    this.system_unavailable.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_fetch_args = function(args) {
  this.username = null;
  this.password = null;
  this.user = null;
  this.portfolio = null;
  if (args) {
    if (args.username !== undefined && args.username !== null) {
      this.username = args.username;
    }
    if (args.password !== undefined && args.password !== null) {
      this.password = args.password;
    }
    if (args.user !== undefined && args.user !== null) {
      this.user = args.user;
    }
    if (args.portfolio !== undefined && args.portfolio !== null) {
      this.portfolio = args.portfolio;
    }
  }
};
TransactionImporter_fetch_args.prototype = {};
TransactionImporter_fetch_args.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.STRING) {
        this.username = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.password = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.user = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.portfolio = input.readString();
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

TransactionImporter_fetch_args.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_fetch_args');
  if (this.username !== null && this.username !== undefined) {
    output.writeFieldBegin('username', Thrift.Type.STRING, 1);
    output.writeString(this.username);
    output.writeFieldEnd();
  }
  if (this.password !== null && this.password !== undefined) {
    output.writeFieldBegin('password', Thrift.Type.STRING, 2);
    output.writeString(this.password);
    output.writeFieldEnd();
  }
  if (this.user !== null && this.user !== undefined) {
    output.writeFieldBegin('user', Thrift.Type.STRING, 3);
    output.writeString(this.user);
    output.writeFieldEnd();
  }
  if (this.portfolio !== null && this.portfolio !== undefined) {
    output.writeFieldBegin('portfolio', Thrift.Type.STRING, 4);
    output.writeString(this.portfolio);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_fetch_result = function(args) {
  this.success = null;
  this.auth_error = null;
  this.system_unavailable = null;
  if (args instanceof ttypes.AuthenticationError) {
    this.auth_error = args;
    return;
  }
  if (args instanceof ttypes.SystemUnavailableError) {
    this.system_unavailable = args;
    return;
  }
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = Thrift.copyList(args.success, [transaction_ttypes.Transaction]);
    }
    if (args.auth_error !== undefined && args.auth_error !== null) {
      this.auth_error = args.auth_error;
    }
    if (args.system_unavailable !== undefined && args.system_unavailable !== null) {
      this.system_unavailable = args.system_unavailable;
    }
  }
};
TransactionImporter_fetch_result.prototype = {};
TransactionImporter_fetch_result.prototype.read = function(input) {
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
        var _size10 = 0;
        var _rtmp314;
        this.success = [];
        var _etype13 = 0;
        _rtmp314 = input.readListBegin();
        _etype13 = _rtmp314.etype;
        _size10 = _rtmp314.size;
        for (var _i15 = 0; _i15 < _size10; ++_i15)
        {
          var elem16 = null;
          elem16 = new transaction_ttypes.Transaction();
          elem16.read(input);
          this.success.push(elem16);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.auth_error = new ttypes.AuthenticationError();
        this.auth_error.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.system_unavailable = new ttypes.SystemUnavailableError();
        this.system_unavailable.read(input);
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

TransactionImporter_fetch_result.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_fetch_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.LIST, 0);
    output.writeListBegin(Thrift.Type.STRUCT, this.success.length);
    for (var iter17 in this.success)
    {
      if (this.success.hasOwnProperty(iter17))
      {
        iter17 = this.success[iter17];
        iter17.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.auth_error !== null && this.auth_error !== undefined) {
    output.writeFieldBegin('auth_error', Thrift.Type.STRUCT, 1);
    this.auth_error.write(output);
    output.writeFieldEnd();
  }
  if (this.system_unavailable !== null && this.system_unavailable !== undefined) {
    output.writeFieldBegin('system_unavailable', Thrift.Type.STRUCT, 2);
    this.system_unavailable.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_portfolio_args = function(args) {
  this.username = null;
  this.password = null;
  this.accounts = null;
  if (args) {
    if (args.username !== undefined && args.username !== null) {
      this.username = args.username;
    }
    if (args.password !== undefined && args.password !== null) {
      this.password = args.password;
    }
    if (args.accounts !== undefined && args.accounts !== null) {
      this.accounts = Thrift.copyList(args.accounts, [ttypes.Account]);
    }
  }
};
TransactionImporter_portfolio_args.prototype = {};
TransactionImporter_portfolio_args.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.STRING) {
        this.username = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.password = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.LIST) {
        var _size18 = 0;
        var _rtmp322;
        this.accounts = [];
        var _etype21 = 0;
        _rtmp322 = input.readListBegin();
        _etype21 = _rtmp322.etype;
        _size18 = _rtmp322.size;
        for (var _i23 = 0; _i23 < _size18; ++_i23)
        {
          var elem24 = null;
          elem24 = new ttypes.Account();
          elem24.read(input);
          this.accounts.push(elem24);
        }
        input.readListEnd();
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

TransactionImporter_portfolio_args.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_portfolio_args');
  if (this.username !== null && this.username !== undefined) {
    output.writeFieldBegin('username', Thrift.Type.STRING, 1);
    output.writeString(this.username);
    output.writeFieldEnd();
  }
  if (this.password !== null && this.password !== undefined) {
    output.writeFieldBegin('password', Thrift.Type.STRING, 2);
    output.writeString(this.password);
    output.writeFieldEnd();
  }
  if (this.accounts !== null && this.accounts !== undefined) {
    output.writeFieldBegin('accounts', Thrift.Type.LIST, 3);
    output.writeListBegin(Thrift.Type.STRUCT, this.accounts.length);
    for (var iter25 in this.accounts)
    {
      if (this.accounts.hasOwnProperty(iter25))
      {
        iter25 = this.accounts[iter25];
        iter25.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporter_portfolio_result = function(args) {
  this.success = null;
  this.auth_error = null;
  this.system_unavailable = null;
  if (args instanceof ttypes.AuthenticationError) {
    this.auth_error = args;
    return;
  }
  if (args instanceof ttypes.SystemUnavailableError) {
    this.system_unavailable = args;
    return;
  }
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = Thrift.copyList(args.success, [portfolio_ttypes.SimplePosition]);
    }
    if (args.auth_error !== undefined && args.auth_error !== null) {
      this.auth_error = args.auth_error;
    }
    if (args.system_unavailable !== undefined && args.system_unavailable !== null) {
      this.system_unavailable = args.system_unavailable;
    }
  }
};
TransactionImporter_portfolio_result.prototype = {};
TransactionImporter_portfolio_result.prototype.read = function(input) {
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
        var _size26 = 0;
        var _rtmp330;
        this.success = [];
        var _etype29 = 0;
        _rtmp330 = input.readListBegin();
        _etype29 = _rtmp330.etype;
        _size26 = _rtmp330.size;
        for (var _i31 = 0; _i31 < _size26; ++_i31)
        {
          var elem32 = null;
          elem32 = new portfolio_ttypes.SimplePosition();
          elem32.read(input);
          this.success.push(elem32);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.auth_error = new ttypes.AuthenticationError();
        this.auth_error.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.system_unavailable = new ttypes.SystemUnavailableError();
        this.system_unavailable.read(input);
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

TransactionImporter_portfolio_result.prototype.write = function(output) {
  output.writeStructBegin('TransactionImporter_portfolio_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.LIST, 0);
    output.writeListBegin(Thrift.Type.STRUCT, this.success.length);
    for (var iter33 in this.success)
    {
      if (this.success.hasOwnProperty(iter33))
      {
        iter33 = this.success[iter33];
        iter33.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.auth_error !== null && this.auth_error !== undefined) {
    output.writeFieldBegin('auth_error', Thrift.Type.STRUCT, 1);
    this.auth_error.write(output);
    output.writeFieldEnd();
  }
  if (this.system_unavailable !== null && this.system_unavailable !== undefined) {
    output.writeFieldBegin('system_unavailable', Thrift.Type.STRUCT, 2);
    this.system_unavailable.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TransactionImporterClient = exports.Client = function(output, pClass) {
    this.output = output;
    this.pClass = pClass;
    this._seqid = 0;
    this._reqs = {};
};
TransactionImporterClient.prototype = {};
TransactionImporterClient.prototype.seqid = function() { return this._seqid; };
TransactionImporterClient.prototype.new_seqid = function() { return this._seqid += 1; };
TransactionImporterClient.prototype.name = function(callback) {
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
    this.send_name();
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_name();
  }
};

TransactionImporterClient.prototype.send_name = function() {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('name', Thrift.MessageType.CALL, this.seqid());
  var args = new TransactionImporter_name_args();
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

TransactionImporterClient.prototype.recv_name = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new TransactionImporter_name_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('name failed: unknown result');
};
TransactionImporterClient.prototype.accounts = function(username, password, callback) {
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
    this.send_accounts(username, password);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_accounts(username, password);
  }
};

TransactionImporterClient.prototype.send_accounts = function(username, password) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('accounts', Thrift.MessageType.CALL, this.seqid());
  var args = new TransactionImporter_accounts_args();
  args.username = username;
  args.password = password;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

TransactionImporterClient.prototype.recv_accounts = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new TransactionImporter_accounts_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.auth_error) {
    return callback(result.auth_error);
  }
  if (null !== result.system_unavailable) {
    return callback(result.system_unavailable);
  }
  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('accounts failed: unknown result');
};
TransactionImporterClient.prototype.fetch = function(username, password, user, portfolio, callback) {
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
    this.send_fetch(username, password, user, portfolio);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_fetch(username, password, user, portfolio);
  }
};

TransactionImporterClient.prototype.send_fetch = function(username, password, user, portfolio) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('fetch', Thrift.MessageType.CALL, this.seqid());
  var args = new TransactionImporter_fetch_args();
  args.username = username;
  args.password = password;
  args.user = user;
  args.portfolio = portfolio;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

TransactionImporterClient.prototype.recv_fetch = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new TransactionImporter_fetch_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.auth_error) {
    return callback(result.auth_error);
  }
  if (null !== result.system_unavailable) {
    return callback(result.system_unavailable);
  }
  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('fetch failed: unknown result');
};
TransactionImporterClient.prototype.portfolio = function(username, password, accounts, callback) {
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
    this.send_portfolio(username, password, accounts);
    return _defer.promise;
  } else {
    this._reqs[this.seqid()] = callback;
    this.send_portfolio(username, password, accounts);
  }
};

TransactionImporterClient.prototype.send_portfolio = function(username, password, accounts) {
  var output = new this.pClass(this.output);
  output.writeMessageBegin('portfolio', Thrift.MessageType.CALL, this.seqid());
  var args = new TransactionImporter_portfolio_args();
  args.username = username;
  args.password = password;
  args.accounts = accounts;
  args.write(output);
  output.writeMessageEnd();
  return this.output.flush();
};

TransactionImporterClient.prototype.recv_portfolio = function(input,mtype,rseqid) {
  var callback = this._reqs[rseqid] || function() {};
  delete this._reqs[rseqid];
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(input);
    input.readMessageEnd();
    return callback(x);
  }
  var result = new TransactionImporter_portfolio_result();
  result.read(input);
  input.readMessageEnd();

  if (null !== result.auth_error) {
    return callback(result.auth_error);
  }
  if (null !== result.system_unavailable) {
    return callback(result.system_unavailable);
  }
  if (null !== result.success) {
    return callback(null, result.success);
  }
  return callback('portfolio failed: unknown result');
};
var TransactionImporterProcessor = exports.Processor = function(handler) {
  this._handler = handler;
}
;
TransactionImporterProcessor.prototype.process = function(input, output) {
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
;
TransactionImporterProcessor.prototype.process_name = function(seqid, input, output) {
  var args = new TransactionImporter_name_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.name.length === 0) {
    Q.fcall(this._handler.name)
      .then(function(result) {
        var result_obj = new TransactionImporter_name_result({success: result});
        output.writeMessageBegin("name", Thrift.MessageType.REPLY, seqid);
        result_obj.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result;
        result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("name", Thrift.MessageType.EXCEPTION, seqid);
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.name(function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined')) {
        result_obj = new TransactionImporter_name_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("name", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("name", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
TransactionImporterProcessor.prototype.process_accounts = function(seqid, input, output) {
  var args = new TransactionImporter_accounts_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.accounts.length === 2) {
    Q.fcall(this._handler.accounts, args.username, args.password)
      .then(function(result) {
        var result_obj = new TransactionImporter_accounts_result({success: result});
        output.writeMessageBegin("accounts", Thrift.MessageType.REPLY, seqid);
        result_obj.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result;
        if (err instanceof ttypes.AuthenticationError || err instanceof ttypes.SystemUnavailableError) {
          result = new TransactionImporter_accounts_result(err);
          output.writeMessageBegin("accounts", Thrift.MessageType.REPLY, seqid);
        } else {
          result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
          output.writeMessageBegin("accounts", Thrift.MessageType.EXCEPTION, seqid);
        }
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.accounts(args.username, args.password, function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined') || err instanceof ttypes.AuthenticationError || err instanceof ttypes.SystemUnavailableError) {
        result_obj = new TransactionImporter_accounts_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("accounts", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("accounts", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
TransactionImporterProcessor.prototype.process_fetch = function(seqid, input, output) {
  var args = new TransactionImporter_fetch_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.fetch.length === 4) {
    Q.fcall(this._handler.fetch, args.username, args.password, args.user, args.portfolio)
      .then(function(result) {
        var result_obj = new TransactionImporter_fetch_result({success: result});
        output.writeMessageBegin("fetch", Thrift.MessageType.REPLY, seqid);
        result_obj.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result;
        if (err instanceof ttypes.AuthenticationError || err instanceof ttypes.SystemUnavailableError) {
          result = new TransactionImporter_fetch_result(err);
          output.writeMessageBegin("fetch", Thrift.MessageType.REPLY, seqid);
        } else {
          result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
          output.writeMessageBegin("fetch", Thrift.MessageType.EXCEPTION, seqid);
        }
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.fetch(args.username, args.password, args.user, args.portfolio, function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined') || err instanceof ttypes.AuthenticationError || err instanceof ttypes.SystemUnavailableError) {
        result_obj = new TransactionImporter_fetch_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("fetch", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("fetch", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
TransactionImporterProcessor.prototype.process_portfolio = function(seqid, input, output) {
  var args = new TransactionImporter_portfolio_args();
  args.read(input);
  input.readMessageEnd();
  if (this._handler.portfolio.length === 3) {
    Q.fcall(this._handler.portfolio, args.username, args.password, args.accounts)
      .then(function(result) {
        var result_obj = new TransactionImporter_portfolio_result({success: result});
        output.writeMessageBegin("portfolio", Thrift.MessageType.REPLY, seqid);
        result_obj.write(output);
        output.writeMessageEnd();
        output.flush();
      }, function (err) {
        var result;
        if (err instanceof ttypes.AuthenticationError || err instanceof ttypes.SystemUnavailableError) {
          result = new TransactionImporter_portfolio_result(err);
          output.writeMessageBegin("portfolio", Thrift.MessageType.REPLY, seqid);
        } else {
          result = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
          output.writeMessageBegin("portfolio", Thrift.MessageType.EXCEPTION, seqid);
        }
        result.write(output);
        output.writeMessageEnd();
        output.flush();
      });
  } else {
    this._handler.portfolio(args.username, args.password, args.accounts, function (err, result) {
      var result_obj;
      if ((err === null || typeof err === 'undefined') || err instanceof ttypes.AuthenticationError || err instanceof ttypes.SystemUnavailableError) {
        result_obj = new TransactionImporter_portfolio_result((err !== null || typeof err === 'undefined') ? err : {success: result});
        output.writeMessageBegin("portfolio", Thrift.MessageType.REPLY, seqid);
      } else {
        result_obj = new Thrift.TApplicationException(Thrift.TApplicationExceptionType.UNKNOWN, err.message);
        output.writeMessageBegin("portfolio", Thrift.MessageType.EXCEPTION, seqid);
      }
      result_obj.write(output);
      output.writeMessageEnd();
      output.flush();
    });
  }
};
