package opencv_apps;

public interface LineArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/LineArray";
  static final java.lang.String _DEFINITION = "Line[] lines\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Line> getLines();
  void setLines(java.util.List<opencv_apps.Line> value);
}
