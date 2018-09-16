package opencv_apps;

public interface Line extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Line";
  static final java.lang.String _DEFINITION = "Point2D pt1\nPoint2D pt2\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  opencv_apps.Point2D getPt1();
  void setPt1(opencv_apps.Point2D value);
  opencv_apps.Point2D getPt2();
  void setPt2(opencv_apps.Point2D value);
}
