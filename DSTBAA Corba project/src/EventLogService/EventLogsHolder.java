package EventLogService;

/**
* EventLogService/EventLogsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DSTBAA.idl
* 21 August 2020 20:34:18 o'clock IST
*/

public final class EventLogsHolder implements org.omg.CORBA.portable.Streamable
{
  public EventLogService.EventLogs value = null;

  public EventLogsHolder ()
  {
  }

  public EventLogsHolder (EventLogService.EventLogs initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EventLogService.EventLogsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EventLogService.EventLogsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EventLogService.EventLogsHelper.type ();
  }

}