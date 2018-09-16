package mavros_msgs;

public interface WaypointPushResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPushResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint32 wp_transfered";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getSuccess();
  void setSuccess(boolean value);
  int getWpTransfered();
  void setWpTransfered(int value);
}
