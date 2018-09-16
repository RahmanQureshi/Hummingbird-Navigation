package mavros_msgs;

public interface FileWriteResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileWriteResponse";
  static final java.lang.String _DEFINITION = "bool success\nint32 r_errno";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getSuccess();
  void setSuccess(boolean value);
  int getRErrno();
  void setRErrno(int value);
}
