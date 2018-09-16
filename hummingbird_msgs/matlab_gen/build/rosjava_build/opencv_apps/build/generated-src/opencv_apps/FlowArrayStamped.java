package opencv_apps;

public interface FlowArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/FlowArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nFlow[] flow\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Flow> getFlow();
  void setFlow(java.util.List<opencv_apps.Flow> value);
}
