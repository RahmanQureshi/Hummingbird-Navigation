package opencv_apps;

public interface CircleArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/CircleArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nCircle[] circles\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Circle> getCircles();
  void setCircles(java.util.List<opencv_apps.Circle> value);
}
