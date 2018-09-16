package opencv_apps;

public interface CircleArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/CircleArray";
  static final java.lang.String _DEFINITION = "Circle[] circles\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Circle> getCircles();
  void setCircles(java.util.List<opencv_apps.Circle> value);
}
