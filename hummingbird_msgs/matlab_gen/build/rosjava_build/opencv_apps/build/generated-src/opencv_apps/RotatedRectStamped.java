package opencv_apps;

public interface RotatedRectStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/RotatedRectStamped";
  static final java.lang.String _DEFINITION = "Header header\nRotatedRect rect\n\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  opencv_apps.RotatedRect getRect();
  void setRect(opencv_apps.RotatedRect value);
}
