package opencv_apps;

public interface FaceArrayStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/FaceArrayStamped";
  static final java.lang.String _DEFINITION = "Header header\nFace[] faces\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<opencv_apps.Face> getFaces();
  void setFaces(java.util.List<opencv_apps.Face> value);
}
