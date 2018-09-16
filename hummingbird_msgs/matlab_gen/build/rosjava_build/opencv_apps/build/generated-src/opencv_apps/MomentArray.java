package opencv_apps;

public interface MomentArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/MomentArray";
  static final java.lang.String _DEFINITION = "Moment[] moments\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Moment> getMoments();
  void setMoments(java.util.List<opencv_apps.Moment> value);
}
