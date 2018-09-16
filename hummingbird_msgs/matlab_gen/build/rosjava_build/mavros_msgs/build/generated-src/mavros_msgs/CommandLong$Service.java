package mavros_msgs;

public interface CommandLong$Service extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandLong$Service";
  static final java.lang.String _DEFINITION = "# Generic COMMAND_LONG\n\nbool broadcast # send this command in broadcast mode\n\nuint16 command\nuint8 confirmation\nfloat32 param1\nfloat32 param2\nfloat32 param3\nfloat32 param4\nfloat32 param5\t# x_lat\nfloat32 param6\t# y_lon\nfloat32 param7\t# z_alt\n---\nbool success\n# raw result returned by COMMAND_ACK\nuint8 result\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
}
