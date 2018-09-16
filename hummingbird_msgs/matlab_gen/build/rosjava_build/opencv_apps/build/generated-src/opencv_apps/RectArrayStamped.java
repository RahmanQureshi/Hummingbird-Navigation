package opencv_apps;

public interface RectArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/RectArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nRect[] rects\n\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Rect> getRects();
  void setRects(java.util.List<opencv_apps.Rect> value);
}
