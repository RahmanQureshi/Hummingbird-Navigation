package opencv_apps;

public interface ContourArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/ContourArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nContour[] contours\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Contour> getContours();
  void setContours(java.util.List<opencv_apps.Contour> value);
}
