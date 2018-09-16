package opencv_apps;

public interface RotatedRectArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/RotatedRectArray";
  static final java.lang.String _DEFINITION = "RotatedRect[] rects\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.RotatedRect> getRects();
  void setRects(java.util.List<opencv_apps.RotatedRect> value);
}
