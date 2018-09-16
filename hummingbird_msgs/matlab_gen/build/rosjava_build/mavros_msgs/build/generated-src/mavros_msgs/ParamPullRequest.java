package mavros_msgs;

public interface ParamPullRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamPullRequest";
  static final java.lang.String _DEFINITION = "# Request parameters from device\n#\n# Returns success status and param_recived count\n\nbool force_pull\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getForcePull();
  void setForcePull(boolean value);
}
