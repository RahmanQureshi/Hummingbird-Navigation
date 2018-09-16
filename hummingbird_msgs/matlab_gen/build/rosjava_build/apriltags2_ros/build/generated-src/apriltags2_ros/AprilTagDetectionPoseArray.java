package apriltags2_ros;

public interface AprilTagDetectionPoseArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "apriltags2_ros/AprilTagDetectionPoseArray";
  static final java.lang.String _DEFINITION = "std_msgs/Header header\nAprilTagDetectionPose[] detections\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<apriltags2_ros.AprilTagDetectionPose> getDetections();
  void setDetections(java.util.List<apriltags2_ros.AprilTagDetectionPose> value);
}
