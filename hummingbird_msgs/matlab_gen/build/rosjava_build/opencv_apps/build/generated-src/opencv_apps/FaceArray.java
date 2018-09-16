package opencv_apps;

public interface FaceArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/FaceArray";
  static final java.lang.String _DEFINITION = "Face[] faces\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Face> getFaces();
  void setFaces(java.util.List<opencv_apps.Face> value);
}
