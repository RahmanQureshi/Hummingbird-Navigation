package opencv_apps;

public interface Circle extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Circle";
  static final java.lang.String _DEFINITION = "Point2D center\nfloat64 radius\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  opencv_apps.Point2D getCenter();
  void setCenter(opencv_apps.Point2D value);
  double getRadius();
  void setRadius(double value);
}
