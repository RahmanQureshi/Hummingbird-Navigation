package mavros_msgs;

public interface WaypointPullResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPullResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint32 wp_received";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getSuccess();
  void setSuccess(boolean value);
  int getWpReceived();
  void setWpReceived(int value);
}
