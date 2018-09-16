package opencv_apps;

public interface RotatedRect extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/RotatedRect";
  static final java.lang.String _DEFINITION = "float64 angle\nPoint2D center\nSize size\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  double getAngle();
  void setAngle(double value);
  opencv_apps.Point2D getCenter();
  void setCenter(opencv_apps.Point2D value);
  opencv_apps.Size getSize();
  void setSize(opencv_apps.Size value);
}
