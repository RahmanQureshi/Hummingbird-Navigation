package opencv_apps;

public interface Point2DStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Point2DStamped";
  static final java.lang.String _DEFINITION = "Header header\nPoint2D point\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  opencv_apps.Point2D getPoint();
  void setPoint(opencv_apps.Point2D value);
}
