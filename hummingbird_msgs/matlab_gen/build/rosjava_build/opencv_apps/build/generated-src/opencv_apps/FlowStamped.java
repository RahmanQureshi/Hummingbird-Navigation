package opencv_apps;

public interface FlowStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/FlowStamped";
  static final java.lang.String _DEFINITION = "Header header\nFlow flow\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  opencv_apps.Flow getFlow();
  void setFlow(opencv_apps.Flow value);
}
