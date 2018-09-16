package mavros_msgs;

public interface ParamPullResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamPullResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint32 param_received";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getSuccess();
  void setSuccess(boolean value);
  int getParamReceived();
  void setParamReceived(int value);
}
