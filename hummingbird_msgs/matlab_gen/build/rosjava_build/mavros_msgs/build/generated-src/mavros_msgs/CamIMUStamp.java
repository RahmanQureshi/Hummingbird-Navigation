package mavros_msgs;

public interface CamIMUStamp extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CamIMUStamp";
  static final java.lang.String _DEFINITION = "# IMU-Camera synchronisation data\n\ntime frame_stamp\t\t# Timestamp when the camera was triggered\nint32 frame_seq_id\t\t# Sequence number of the image frame\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  org.ros.message.Time getFrameStamp();
  void setFrameStamp(org.ros.message.Time value);
  int getFrameSeqId();
  void setFrameSeqId(int value);
}
