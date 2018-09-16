package mavros_msgs;

public interface FileOpenResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileOpenResponse";
  static final java.lang.String _DEFINITION = "uint32 size\nbool success\nint32 r_errno";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  int getSize();
  void setSize(int value);
  boolean getSuccess();
  void setSuccess(boolean value);
  int getRErrno();
  void setRErrno(int value);
}
