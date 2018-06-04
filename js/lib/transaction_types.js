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


var ttypes = module.exports = {};
ttypes.StockBuyTransactionType = {
  'REGULAR' : 1,
  'IPO' : 2
};
ttypes.StockOptionTransactionType = {
  'BUY' : 1,
  'SELL' : 2
};
ttypes.SecurityLendingAndBorrowingType = {
  'LENDER' : 1,
  'BORROWER' : 2
};
ttypes.TransferType = {
  'IN' : 1,
  'OUT' : 2
};
var StockSell = module.exports.StockSell = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  this.price = null;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
    if (args.price !== undefined && args.price !== null) {
      this.price = args.price;
    }
  }
};
StockSell.prototype = {};
StockSell.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.DOUBLE) {
        this.price = input.readDouble();
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

StockSell.prototype.write = function(output) {
  output.writeStructBegin('StockSell');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  if (this.price !== null && this.price !== undefined) {
    output.writeFieldBegin('price', Thrift.Type.DOUBLE, 4);
    output.writeDouble(this.price);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var StockBuy = module.exports.StockBuy = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  this.price = null;
  this.type = 1;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
    if (args.price !== undefined && args.price !== null) {
      this.price = args.price;
    }
    if (args.type !== undefined && args.type !== null) {
      this.type = args.type;
    }
  }
};
StockBuy.prototype = {};
StockBuy.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.DOUBLE) {
        this.price = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
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

StockBuy.prototype.write = function(output) {
  output.writeStructBegin('StockBuy');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  if (this.price !== null && this.price !== undefined) {
    output.writeFieldBegin('price', Thrift.Type.DOUBLE, 4);
    output.writeDouble(this.price);
    output.writeFieldEnd();
  }
  if (this.type !== null && this.type !== undefined) {
    output.writeFieldBegin('type', Thrift.Type.I32, 5);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var Subscription = module.exports.Subscription = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
  }
};
Subscription.prototype = {};
Subscription.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
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

Subscription.prototype.write = function(output) {
  output.writeStructBegin('Subscription');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var StockOption = module.exports.StockOption = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  this.price = null;
  this.maturity = null;
  this.transaction_type = null;
  this.type = 1;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
    if (args.price !== undefined && args.price !== null) {
      this.price = args.price;
    }
    if (args.maturity !== undefined && args.maturity !== null) {
      this.maturity = args.maturity;
    }
    if (args.transaction_type !== undefined && args.transaction_type !== null) {
      this.transaction_type = args.transaction_type;
    }
    if (args.type !== undefined && args.type !== null) {
      this.type = args.type;
    }
  }
};
StockOption.prototype = {};
StockOption.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.DOUBLE) {
        this.price = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.maturity = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I32) {
        this.transaction_type = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
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

StockOption.prototype.write = function(output) {
  output.writeStructBegin('StockOption');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  if (this.price !== null && this.price !== undefined) {
    output.writeFieldBegin('price', Thrift.Type.DOUBLE, 4);
    output.writeDouble(this.price);
    output.writeFieldEnd();
  }
  if (this.maturity !== null && this.maturity !== undefined) {
    output.writeFieldBegin('maturity', Thrift.Type.I64, 5);
    output.writeI64(this.maturity);
    output.writeFieldEnd();
  }
  if (this.transaction_type !== null && this.transaction_type !== undefined) {
    output.writeFieldBegin('transaction_type', Thrift.Type.I32, 6);
    output.writeI32(this.transaction_type);
    output.writeFieldEnd();
  }
  if (this.type !== null && this.type !== undefined) {
    output.writeFieldBegin('type', Thrift.Type.I32, 7);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var SecurityLendingAndBorrowing = module.exports.SecurityLendingAndBorrowing = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  this.rate = null;
  this.due = null;
  this.type = null;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
    if (args.rate !== undefined && args.rate !== null) {
      this.rate = args.rate;
    }
    if (args.due !== undefined && args.due !== null) {
      this.due = args.due;
    }
    if (args.type !== undefined && args.type !== null) {
      this.type = args.type;
    }
  }
};
SecurityLendingAndBorrowing.prototype = {};
SecurityLendingAndBorrowing.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.DOUBLE) {
        this.rate = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.due = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
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

SecurityLendingAndBorrowing.prototype.write = function(output) {
  output.writeStructBegin('SecurityLendingAndBorrowing');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  if (this.rate !== null && this.rate !== undefined) {
    output.writeFieldBegin('rate', Thrift.Type.DOUBLE, 4);
    output.writeDouble(this.rate);
    output.writeFieldEnd();
  }
  if (this.due !== null && this.due !== undefined) {
    output.writeFieldBegin('due', Thrift.Type.I64, 5);
    output.writeI64(this.due);
    output.writeFieldEnd();
  }
  if (this.type !== null && this.type !== undefined) {
    output.writeFieldBegin('type', Thrift.Type.I32, 6);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var SecurityLendingAndBorrowingReturning = module.exports.SecurityLendingAndBorrowingReturning = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  this.value = null;
  this.type = null;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
    if (args.value !== undefined && args.value !== null) {
      this.value = args.value;
    }
    if (args.type !== undefined && args.type !== null) {
      this.type = args.type;
    }
  }
};
SecurityLendingAndBorrowingReturning.prototype = {};
SecurityLendingAndBorrowingReturning.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.DOUBLE) {
        this.value = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
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

SecurityLendingAndBorrowingReturning.prototype.write = function(output) {
  output.writeStructBegin('SecurityLendingAndBorrowingReturning');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  if (this.value !== null && this.value !== undefined) {
    output.writeFieldBegin('value', Thrift.Type.DOUBLE, 4);
    output.writeDouble(this.value);
    output.writeFieldEnd();
  }
  if (this.type !== null && this.type !== undefined) {
    output.writeFieldBegin('type', Thrift.Type.I32, 5);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var CommissionExpense = module.exports.CommissionExpense = function(args) {
  this.date = null;
  this.amount = null;
  this.description = null;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.amount !== undefined && args.amount !== null) {
      this.amount = args.amount;
    }
    if (args.description !== undefined && args.description !== null) {
      this.description = args.description;
    }
  }
};
CommissionExpense.prototype = {};
CommissionExpense.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.DOUBLE) {
        this.amount = input.readDouble();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.description = input.readString();
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

CommissionExpense.prototype.write = function(output) {
  output.writeStructBegin('CommissionExpense');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.amount !== null && this.amount !== undefined) {
    output.writeFieldBegin('amount', Thrift.Type.DOUBLE, 2);
    output.writeDouble(this.amount);
    output.writeFieldEnd();
  }
  if (this.description !== null && this.description !== undefined) {
    output.writeFieldBegin('description', Thrift.Type.STRING, 3);
    output.writeString(this.description);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var Transfer = module.exports.Transfer = function(args) {
  this.date = null;
  this.stock = null;
  this.shares = null;
  this.type = null;
  if (args) {
    if (args.date !== undefined && args.date !== null) {
      this.date = args.date;
    }
    if (args.stock !== undefined && args.stock !== null) {
      this.stock = new common_ttypes.StockId(args.stock);
    }
    if (args.shares !== undefined && args.shares !== null) {
      this.shares = args.shares;
    }
    if (args.type !== undefined && args.type !== null) {
      this.type = args.type;
    }
  }
};
Transfer.prototype = {};
Transfer.prototype.read = function(input) {
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
      if (ftype == Thrift.Type.I64) {
        this.date = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock = new common_ttypes.StockId();
        this.stock.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I32) {
        this.shares = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
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

Transfer.prototype.write = function(output) {
  output.writeStructBegin('Transfer');
  if (this.date !== null && this.date !== undefined) {
    output.writeFieldBegin('date', Thrift.Type.I64, 1);
    output.writeI64(this.date);
    output.writeFieldEnd();
  }
  if (this.stock !== null && this.stock !== undefined) {
    output.writeFieldBegin('stock', Thrift.Type.STRUCT, 2);
    this.stock.write(output);
    output.writeFieldEnd();
  }
  if (this.shares !== null && this.shares !== undefined) {
    output.writeFieldBegin('shares', Thrift.Type.I32, 3);
    output.writeI32(this.shares);
    output.writeFieldEnd();
  }
  if (this.type !== null && this.type !== undefined) {
    output.writeFieldBegin('type', Thrift.Type.I32, 4);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var Transaction = module.exports.Transaction = function(args) {
  this.stock_buy = null;
  this.stock_sell = null;
  this.slb = null;
  this.slbr = null;
  this.stock_commission_expense = null;
  this.stock_option = null;
  this.subscription = null;
  this.transfer = null;
  if (args) {
    if (args.stock_buy !== undefined && args.stock_buy !== null) {
      this.stock_buy = new ttypes.StockBuy(args.stock_buy);
    }
    if (args.stock_sell !== undefined && args.stock_sell !== null) {
      this.stock_sell = new ttypes.StockSell(args.stock_sell);
    }
    if (args.slb !== undefined && args.slb !== null) {
      this.slb = new ttypes.SecurityLendingAndBorrowing(args.slb);
    }
    if (args.slbr !== undefined && args.slbr !== null) {
      this.slbr = new ttypes.SecurityLendingAndBorrowingReturning(args.slbr);
    }
    if (args.stock_commission_expense !== undefined && args.stock_commission_expense !== null) {
      this.stock_commission_expense = new ttypes.CommissionExpense(args.stock_commission_expense);
    }
    if (args.stock_option !== undefined && args.stock_option !== null) {
      this.stock_option = new ttypes.StockOption(args.stock_option);
    }
    if (args.subscription !== undefined && args.subscription !== null) {
      this.subscription = new ttypes.Subscription(args.subscription);
    }
    if (args.transfer !== undefined && args.transfer !== null) {
      this.transfer = new ttypes.Transfer(args.transfer);
    }
  }
};
Transaction.prototype = {};
Transaction.prototype.read = function(input) {
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
        this.stock_buy = new ttypes.StockBuy();
        this.stock_buy.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock_sell = new ttypes.StockSell();
        this.stock_sell.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRUCT) {
        this.slb = new ttypes.SecurityLendingAndBorrowing();
        this.slb.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRUCT) {
        this.slbr = new ttypes.SecurityLendingAndBorrowingReturning();
        this.slbr.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock_commission_expense = new ttypes.CommissionExpense();
        this.stock_commission_expense.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.STRUCT) {
        this.stock_option = new ttypes.StockOption();
        this.stock_option.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.STRUCT) {
        this.subscription = new ttypes.Subscription();
        this.subscription.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.STRUCT) {
        this.transfer = new ttypes.Transfer();
        this.transfer.read(input);
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

Transaction.prototype.write = function(output) {
  output.writeStructBegin('Transaction');
  if (this.stock_buy !== null && this.stock_buy !== undefined) {
    output.writeFieldBegin('stock_buy', Thrift.Type.STRUCT, 1);
    this.stock_buy.write(output);
    output.writeFieldEnd();
  }
  if (this.stock_sell !== null && this.stock_sell !== undefined) {
    output.writeFieldBegin('stock_sell', Thrift.Type.STRUCT, 2);
    this.stock_sell.write(output);
    output.writeFieldEnd();
  }
  if (this.slb !== null && this.slb !== undefined) {
    output.writeFieldBegin('slb', Thrift.Type.STRUCT, 3);
    this.slb.write(output);
    output.writeFieldEnd();
  }
  if (this.slbr !== null && this.slbr !== undefined) {
    output.writeFieldBegin('slbr', Thrift.Type.STRUCT, 4);
    this.slbr.write(output);
    output.writeFieldEnd();
  }
  if (this.stock_commission_expense !== null && this.stock_commission_expense !== undefined) {
    output.writeFieldBegin('stock_commission_expense', Thrift.Type.STRUCT, 5);
    this.stock_commission_expense.write(output);
    output.writeFieldEnd();
  }
  if (this.stock_option !== null && this.stock_option !== undefined) {
    output.writeFieldBegin('stock_option', Thrift.Type.STRUCT, 6);
    this.stock_option.write(output);
    output.writeFieldEnd();
  }
  if (this.subscription !== null && this.subscription !== undefined) {
    output.writeFieldBegin('subscription', Thrift.Type.STRUCT, 7);
    this.subscription.write(output);
    output.writeFieldEnd();
  }
  if (this.transfer !== null && this.transfer !== undefined) {
    output.writeFieldBegin('transfer', Thrift.Type.STRUCT, 8);
    this.transfer.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

