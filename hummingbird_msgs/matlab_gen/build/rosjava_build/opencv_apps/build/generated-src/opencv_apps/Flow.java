package opencv_apps;

public interface Flow extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Flow";
  static final java.lang.String _DEFINITION = "Point2D point\nPoint2D velocity\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  opencv_apps.Point2D getPoint();
  void setPoint(opencv_apps.Point2D value);
  opencv_apps.Point2D getVelocity();
  void setVelocity(opencv_apps.Point2D value);
}
