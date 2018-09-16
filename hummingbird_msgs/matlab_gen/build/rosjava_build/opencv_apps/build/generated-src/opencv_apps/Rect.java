package opencv_apps;

public interface Rect extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/Rect";
  static final java.lang.String _DEFINITION = "# opencv Rect data type, x-y is center point\nfloat64 x\nfloat64 y\nfloat64 width\nfloat64 height\n\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  double getX();
  void setX(double value);
  double getY();
  void setY(double value);
  double getWidth();
  void setWidth(double value);
  double getHeight();
  void setHeight(double value);
}
