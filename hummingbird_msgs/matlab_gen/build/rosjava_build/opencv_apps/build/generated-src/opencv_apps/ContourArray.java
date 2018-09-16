package opencv_apps;

public interface ContourArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/ContourArray";
  static final java.lang.String _DEFINITION = "Contour[] contours\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Contour> getContours();
  void setContours(java.util.List<opencv_apps.Contour> value);
}
