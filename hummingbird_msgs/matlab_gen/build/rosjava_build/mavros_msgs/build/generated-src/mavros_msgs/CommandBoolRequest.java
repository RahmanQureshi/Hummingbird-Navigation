package mavros_msgs;

public interface CommandBoolRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandBoolRequest";
  static final java.lang.String _DEFINITION = "# Common type for switch commands\n\nbool value\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getValue();
  void setValue(boolean value);
}
