package mavros_msgs;

public interface WaypointPull$Service extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPull$Service";
  static final java.lang.String _DEFINITION = "# Requests waypoints from device\n#\n# Returns success status and received count\n\n---\nbool success\nuint32 wp_received\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
}
