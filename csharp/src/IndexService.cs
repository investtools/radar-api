/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

public partial class IndexService {
  public interface ISync {
    List<Price> prices(string symbol, long start_date, long end_date);
    double price(string symbol, long date);
    double price_change(string symbol, long start_date, long end_date);
  }

  public interface Iface : ISync {
    #if SILVERLIGHT
    IAsyncResult Begin_prices(AsyncCallback callback, object state, string symbol, long start_date, long end_date);
    List<Price> End_prices(IAsyncResult asyncResult);
    #endif
    #if SILVERLIGHT
    IAsyncResult Begin_price(AsyncCallback callback, object state, string symbol, long date);
    double End_price(IAsyncResult asyncResult);
    #endif
    #if SILVERLIGHT
    IAsyncResult Begin_price_change(AsyncCallback callback, object state, string symbol, long start_date, long end_date);
    double End_price_change(IAsyncResult asyncResult);
    #endif
  }

  public class Client : IDisposable, Iface {
    public Client(TProtocol prot) : this(prot, prot)
    {
    }

    public Client(TProtocol iprot, TProtocol oprot)
    {
      iprot_ = iprot;
      oprot_ = oprot;
    }

    protected TProtocol iprot_;
    protected TProtocol oprot_;
    protected int seqid_;

    public TProtocol InputProtocol
    {
      get { return iprot_; }
    }
    public TProtocol OutputProtocol
    {
      get { return oprot_; }
    }


    #region " IDisposable Support "
    private bool _IsDisposed;

    // IDisposable
    public void Dispose()
    {
      Dispose(true);
    }
    

    protected virtual void Dispose(bool disposing)
    {
      if (!_IsDisposed)
      {
        if (disposing)
        {
          if (iprot_ != null)
          {
            ((IDisposable)iprot_).Dispose();
          }
          if (oprot_ != null)
          {
            ((IDisposable)oprot_).Dispose();
          }
        }
      }
      _IsDisposed = true;
    }
    #endregion


    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_prices(AsyncCallback callback, object state, string symbol, long start_date, long end_date)
    {
      return send_prices(callback, state, symbol, start_date, end_date);
    }

    public List<Price> End_prices(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      return recv_prices();
    }

    #endif

    public List<Price> prices(string symbol, long start_date, long end_date)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_prices(null, null, symbol, start_date, end_date);
      return End_prices(asyncResult);

      #else
      send_prices(symbol, start_date, end_date);
      return recv_prices();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_prices(AsyncCallback callback, object state, string symbol, long start_date, long end_date)
    {
      oprot_.WriteMessageBegin(new TMessage("prices", TMessageType.Call, seqid_));
      prices_args args = new prices_args();
      args.Symbol = symbol;
      args.Start_date = start_date;
      args.End_date = end_date;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_prices(string symbol, long start_date, long end_date)
    {
      oprot_.WriteMessageBegin(new TMessage("prices", TMessageType.Call, seqid_));
      prices_args args = new prices_args();
      args.Symbol = symbol;
      args.Start_date = start_date;
      args.End_date = end_date;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public List<Price> recv_prices()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      prices_result result = new prices_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.success) {
        return result.Success;
      }
      throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "prices failed: unknown result");
    }

    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_price(AsyncCallback callback, object state, string symbol, long date)
    {
      return send_price(callback, state, symbol, date);
    }

    public double End_price(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      return recv_price();
    }

    #endif

    public double price(string symbol, long date)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_price(null, null, symbol, date);
      return End_price(asyncResult);

      #else
      send_price(symbol, date);
      return recv_price();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_price(AsyncCallback callback, object state, string symbol, long date)
    {
      oprot_.WriteMessageBegin(new TMessage("price", TMessageType.Call, seqid_));
      price_args args = new price_args();
      args.Symbol = symbol;
      args.Date = date;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_price(string symbol, long date)
    {
      oprot_.WriteMessageBegin(new TMessage("price", TMessageType.Call, seqid_));
      price_args args = new price_args();
      args.Symbol = symbol;
      args.Date = date;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public double recv_price()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      price_result result = new price_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.success) {
        return result.Success;
      }
      throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "price failed: unknown result");
    }

    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_price_change(AsyncCallback callback, object state, string symbol, long start_date, long end_date)
    {
      return send_price_change(callback, state, symbol, start_date, end_date);
    }

    public double End_price_change(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      return recv_price_change();
    }

    #endif

    public double price_change(string symbol, long start_date, long end_date)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_price_change(null, null, symbol, start_date, end_date);
      return End_price_change(asyncResult);

      #else
      send_price_change(symbol, start_date, end_date);
      return recv_price_change();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_price_change(AsyncCallback callback, object state, string symbol, long start_date, long end_date)
    {
      oprot_.WriteMessageBegin(new TMessage("price_change", TMessageType.Call, seqid_));
      price_change_args args = new price_change_args();
      args.Symbol = symbol;
      args.Start_date = start_date;
      args.End_date = end_date;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_price_change(string symbol, long start_date, long end_date)
    {
      oprot_.WriteMessageBegin(new TMessage("price_change", TMessageType.Call, seqid_));
      price_change_args args = new price_change_args();
      args.Symbol = symbol;
      args.Start_date = start_date;
      args.End_date = end_date;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public double recv_price_change()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      price_change_result result = new price_change_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.success) {
        return result.Success;
      }
      throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "price_change failed: unknown result");
    }

  }
  public class Processor : TProcessor {
    public Processor(ISync iface)
    {
      iface_ = iface;
      processMap_["prices"] = prices_Process;
      processMap_["price"] = price_Process;
      processMap_["price_change"] = price_change_Process;
    }

    protected delegate void ProcessFunction(int seqid, TProtocol iprot, TProtocol oprot);
    private ISync iface_;
    protected Dictionary<string, ProcessFunction> processMap_ = new Dictionary<string, ProcessFunction>();

    public bool Process(TProtocol iprot, TProtocol oprot)
    {
      try
      {
        TMessage msg = iprot.ReadMessageBegin();
        ProcessFunction fn;
        processMap_.TryGetValue(msg.Name, out fn);
        if (fn == null) {
          TProtocolUtil.Skip(iprot, TType.Struct);
          iprot.ReadMessageEnd();
          TApplicationException x = new TApplicationException (TApplicationException.ExceptionType.UnknownMethod, "Invalid method name: '" + msg.Name + "'");
          oprot.WriteMessageBegin(new TMessage(msg.Name, TMessageType.Exception, msg.SeqID));
          x.Write(oprot);
          oprot.WriteMessageEnd();
          oprot.Transport.Flush();
          return true;
        }
        fn(msg.SeqID, iprot, oprot);
      }
      catch (IOException)
      {
        return false;
      }
      return true;
    }

    public void prices_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      prices_args args = new prices_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      prices_result result = new prices_result();
      try
      {
        result.Success = iface_.prices(args.Symbol, args.Start_date, args.End_date);
        oprot.WriteMessageBegin(new TMessage("prices", TMessageType.Reply, seqid)); 
        result.Write(oprot);
      }
      catch (TTransportException)
      {
        throw;
      }
      catch (Exception ex)
      {
        Console.Error.WriteLine("Error occurred in processor:");
        Console.Error.WriteLine(ex.ToString());
        TApplicationException x = new TApplicationException      (TApplicationException.ExceptionType.InternalError," Internal error.");
        oprot.WriteMessageBegin(new TMessage("prices", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

    public void price_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      price_args args = new price_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      price_result result = new price_result();
      try
      {
        result.Success = iface_.price(args.Symbol, args.Date);
        oprot.WriteMessageBegin(new TMessage("price", TMessageType.Reply, seqid)); 
        result.Write(oprot);
      }
      catch (TTransportException)
      {
        throw;
      }
      catch (Exception ex)
      {
        Console.Error.WriteLine("Error occurred in processor:");
        Console.Error.WriteLine(ex.ToString());
        TApplicationException x = new TApplicationException      (TApplicationException.ExceptionType.InternalError," Internal error.");
        oprot.WriteMessageBegin(new TMessage("price", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

    public void price_change_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      price_change_args args = new price_change_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      price_change_result result = new price_change_result();
      try
      {
        result.Success = iface_.price_change(args.Symbol, args.Start_date, args.End_date);
        oprot.WriteMessageBegin(new TMessage("price_change", TMessageType.Reply, seqid)); 
        result.Write(oprot);
      }
      catch (TTransportException)
      {
        throw;
      }
      catch (Exception ex)
      {
        Console.Error.WriteLine("Error occurred in processor:");
        Console.Error.WriteLine(ex.ToString());
        TApplicationException x = new TApplicationException      (TApplicationException.ExceptionType.InternalError," Internal error.");
        oprot.WriteMessageBegin(new TMessage("price_change", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class prices_args : TBase
  {
    private string _symbol;
    private long _start_date;
    private long _end_date;

    public string Symbol
    {
      get
      {
        return _symbol;
      }
      set
      {
        __isset.symbol = true;
        this._symbol = value;
      }
    }

    public long Start_date
    {
      get
      {
        return _start_date;
      }
      set
      {
        __isset.start_date = true;
        this._start_date = value;
      }
    }

    public long End_date
    {
      get
      {
        return _end_date;
      }
      set
      {
        __isset.end_date = true;
        this._end_date = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool symbol;
      public bool start_date;
      public bool end_date;
    }

    public prices_args() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.String) {
                Symbol = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I64) {
                Start_date = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I64) {
                End_date = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("prices_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Symbol != null && __isset.symbol) {
          field.Name = "symbol";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Symbol);
          oprot.WriteFieldEnd();
        }
        if (__isset.start_date) {
          field.Name = "start_date";
          field.Type = TType.I64;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Start_date);
          oprot.WriteFieldEnd();
        }
        if (__isset.end_date) {
          field.Name = "end_date";
          field.Type = TType.I64;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(End_date);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("prices_args(");
      bool __first = true;
      if (Symbol != null && __isset.symbol) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Symbol: ");
        __sb.Append(Symbol);
      }
      if (__isset.start_date) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Start_date: ");
        __sb.Append(Start_date);
      }
      if (__isset.end_date) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("End_date: ");
        __sb.Append(End_date);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class prices_result : TBase
  {
    private List<Price> _success;

    public List<Price> Success
    {
      get
      {
        return _success;
      }
      set
      {
        __isset.success = true;
        this._success = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool success;
    }

    public prices_result() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 0:
              if (field.Type == TType.List) {
                {
                  Success = new List<Price>();
                  TList _list32 = iprot.ReadListBegin();
                  for( int _i33 = 0; _i33 < _list32.Count; ++_i33)
                  {
                    Price _elem34;
                    _elem34 = new Price();
                    _elem34.Read(iprot);
                    Success.Add(_elem34);
                  }
                  iprot.ReadListEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("prices_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.success) {
          if (Success != null) {
            field.Name = "Success";
            field.Type = TType.List;
            field.ID = 0;
            oprot.WriteFieldBegin(field);
            {
              oprot.WriteListBegin(new TList(TType.Struct, Success.Count));
              foreach (Price _iter35 in Success)
              {
                _iter35.Write(oprot);
              }
              oprot.WriteListEnd();
            }
            oprot.WriteFieldEnd();
          }
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("prices_result(");
      bool __first = true;
      if (Success != null && __isset.success) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Success: ");
        __sb.Append(Success);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class price_args : TBase
  {
    private string _symbol;
    private long _date;

    public string Symbol
    {
      get
      {
        return _symbol;
      }
      set
      {
        __isset.symbol = true;
        this._symbol = value;
      }
    }

    public long Date
    {
      get
      {
        return _date;
      }
      set
      {
        __isset.date = true;
        this._date = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool symbol;
      public bool date;
    }

    public price_args() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.String) {
                Symbol = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I64) {
                Date = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("price_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Symbol != null && __isset.symbol) {
          field.Name = "symbol";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Symbol);
          oprot.WriteFieldEnd();
        }
        if (__isset.date) {
          field.Name = "date";
          field.Type = TType.I64;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Date);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("price_args(");
      bool __first = true;
      if (Symbol != null && __isset.symbol) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Symbol: ");
        __sb.Append(Symbol);
      }
      if (__isset.date) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Date: ");
        __sb.Append(Date);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class price_result : TBase
  {
    private double _success;

    public double Success
    {
      get
      {
        return _success;
      }
      set
      {
        __isset.success = true;
        this._success = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool success;
    }

    public price_result() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 0:
              if (field.Type == TType.Double) {
                Success = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("price_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.success) {
          field.Name = "Success";
          field.Type = TType.Double;
          field.ID = 0;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(Success);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("price_result(");
      bool __first = true;
      if (__isset.success) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Success: ");
        __sb.Append(Success);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class price_change_args : TBase
  {
    private string _symbol;
    private long _start_date;
    private long _end_date;

    public string Symbol
    {
      get
      {
        return _symbol;
      }
      set
      {
        __isset.symbol = true;
        this._symbol = value;
      }
    }

    public long Start_date
    {
      get
      {
        return _start_date;
      }
      set
      {
        __isset.start_date = true;
        this._start_date = value;
      }
    }

    public long End_date
    {
      get
      {
        return _end_date;
      }
      set
      {
        __isset.end_date = true;
        this._end_date = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool symbol;
      public bool start_date;
      public bool end_date;
    }

    public price_change_args() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.String) {
                Symbol = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.I64) {
                Start_date = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I64) {
                End_date = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("price_change_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Symbol != null && __isset.symbol) {
          field.Name = "symbol";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Symbol);
          oprot.WriteFieldEnd();
        }
        if (__isset.start_date) {
          field.Name = "start_date";
          field.Type = TType.I64;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Start_date);
          oprot.WriteFieldEnd();
        }
        if (__isset.end_date) {
          field.Name = "end_date";
          field.Type = TType.I64;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(End_date);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("price_change_args(");
      bool __first = true;
      if (Symbol != null && __isset.symbol) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Symbol: ");
        __sb.Append(Symbol);
      }
      if (__isset.start_date) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Start_date: ");
        __sb.Append(Start_date);
      }
      if (__isset.end_date) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("End_date: ");
        __sb.Append(End_date);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class price_change_result : TBase
  {
    private double _success;

    public double Success
    {
      get
      {
        return _success;
      }
      set
      {
        __isset.success = true;
        this._success = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool success;
    }

    public price_change_result() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 0:
              if (field.Type == TType.Double) {
                Success = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("price_change_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.success) {
          field.Name = "Success";
          field.Type = TType.Double;
          field.ID = 0;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(Success);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("price_change_result(");
      bool __first = true;
      if (__isset.success) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Success: ");
        __sb.Append(Success);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
