package opencv_apps;

public interface RotatedRectArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/RotatedRectArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nRotatedRect[] rects\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.RotatedRect> getRects();
  void setRects(java.util.List<opencv_apps.RotatedRect> value);
}
