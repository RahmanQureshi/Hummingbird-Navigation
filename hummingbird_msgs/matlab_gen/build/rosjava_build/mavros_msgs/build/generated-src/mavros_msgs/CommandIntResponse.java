package mavros_msgs;

public interface CommandIntResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandIntResponse";
  static final java.lang.String _DEFINITION = "bool success\n# seems that this message don\'t produce andy COMMAND_ACK messages\n# so no result field";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  boolean getSuccess();
  void setSuccess(boolean value);
}
