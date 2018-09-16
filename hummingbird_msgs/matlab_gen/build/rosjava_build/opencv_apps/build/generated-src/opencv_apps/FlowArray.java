package opencv_apps;

public interface FlowArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "opencv_apps/FlowArray";
  static final java.lang.String _DEFINITION = "Flow[] flow\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  java.util.List<opencv_apps.Flow> getFlow();
  void setFlow(java.util.List<opencv_apps.Flow> value);
}
