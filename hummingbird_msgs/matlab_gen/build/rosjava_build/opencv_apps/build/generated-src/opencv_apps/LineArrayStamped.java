package opencv_apps;

public interface LineArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/LineArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nLine[] lines\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Line> getLines();
  void setLines(java.util.List<opencv_apps.Line> value);
}
