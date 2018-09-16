package mavros_msgs;

public interface ParamPushResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamPushResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint32 param_transfered";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getSuccess();
  void setSuccess(boolean value);
  int getParamTransfered();
  void setParamTransfered(int value);
}
