package mavros_msgs;

public interface WaypointSetCurrent$Service extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointSetCurrent$Service";
  static final java.lang.String _DEFINITION = "# Request set current waypoint\n#\n# wp_seq - index in waypoint array\n\nuint16 wp_seq\n---\nbool success\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
}
