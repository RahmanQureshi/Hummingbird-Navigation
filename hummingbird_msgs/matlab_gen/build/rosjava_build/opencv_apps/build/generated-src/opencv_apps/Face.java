package opencv_apps;

public interface Face extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Face";
  static final java.lang.String _DEFINITION = "Rect face\nRect[] eyes\nstring label\nfloat64 confidence\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  opencv_apps.Rect getFace();
  void setFace(opencv_apps.Rect value);
  java.util.List<opencv_apps.Rect> getEyes();
  void setEyes(java.util.List<opencv_apps.Rect> value);
  java.lang.String getLabel();
  void setLabel(java.lang.String value);
  double getConfidence();
  void setConfidence(double value);
}
