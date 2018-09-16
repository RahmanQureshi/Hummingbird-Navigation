package apriltags2_ros;

public interface AprilTagDetectionPose extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "apriltags2_ros/AprilTagDetectionPose";
  static final java.lang.String _DEFINITION = "# Tag ID(s). If a standalone tag, this is a vector of size 1. If a tag bundle,\n# this is a vector containing the IDs of each tag in the bundle.\nint32[] id\n\n# Tag size(s). If a standalone tag, this is a vector of size 1. If a tag bundle,\n# this is a vector containing the sizes of each tag in the bundle, in the same\n# order as the IDs above.\nfloat64[] size\n\n# Pose in the camera frame, obtained from homography transform. If a standalone\n# tag, the homography is from the four tag corners. If a tag bundle, the\n# homography is from at least the four corners of one member tag and at most the\n# four corners of all member tags.\ngeometry_msgs/PoseWithCovarianceStamped pose\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  int[] getId();
  void setId(int[] value);
  double[] getSize();
  void setSize(double[] value);
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
}
