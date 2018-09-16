package mavros_msgs;

public interface ParamGetRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamGetRequest";
  static final java.lang.String _DEFINITION = "# Request parameter from attached device\n\nstring param_id\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  java.lang.String getParamId();
  void setParamId(java.lang.String value);
}
