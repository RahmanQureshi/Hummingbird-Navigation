package mavros_msgs;

public interface RCIn extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/RCIn";
  static final java.lang.String _DEFINITION = "# RAW RC input state\n\nstd_msgs/Header header\nuint8 rssi\nuint16[] channels\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getRssi();
  void setRssi(byte value);
  short[] getChannels();
  void setChannels(short[] value);
}
