package opencv_apps;

public interface Size extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Size";
  static final java.lang.String _DEFINITION = "float64 width\nfloat64 height\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  double getWidth();
  void setWidth(double value);
  double getHeight();
  void setHeight(double value);
}
