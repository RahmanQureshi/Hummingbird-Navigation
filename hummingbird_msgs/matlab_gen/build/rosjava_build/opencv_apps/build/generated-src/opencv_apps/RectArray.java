package opencv_apps;

public interface RectArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/RectArray";
  static final java.lang.String _DEFINITION = "Rect[] rects\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Rect> getRects();
  void setRects(java.util.List<opencv_apps.Rect> value);
}
