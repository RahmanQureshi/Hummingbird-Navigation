package mavros_msgs;

public interface CommandTriggerControl$Service extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandTriggerControl$Service";
  static final java.lang.String _DEFINITION = "# Type for controlling onboard camera trigerring system\n\nbool    trigger_enable\t\t# Trigger on/off control\nfloat32 cycle_time\t\t# Camera trigger cycle time. Zero to use current onboard value.\n---\nbool success\nuint8 result\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
}
