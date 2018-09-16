package opencv_apps;

public interface MomentArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/MomentArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nMoment[] moments\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Moment> getMoments();
  void setMoments(java.util.List<opencv_apps.Moment> value);
}
