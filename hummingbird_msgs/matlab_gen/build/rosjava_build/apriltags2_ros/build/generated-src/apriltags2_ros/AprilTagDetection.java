package apriltags2_ros;

public interface AprilTagDetection extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "apriltags2_ros/AprilTagDetection";
  static final java.lang.String _DEFINITION = "# The family of the Tag\nAprilTagFamily family\n\n# The Decoded ID of the tag\nint8 id\n\n# How many error bits were corrected\nint8 hamming\n\n# A measure of the quality of tag localization, average contrast of the pixels\n# around the border of the tag\nfloat32 goodness\n\n# A measure of the quality of the binary decoding process\nfloat32 decision_margin\n\n# The Homography Matrix Describing the projection\nMatrix H\n\n# The Center of the Detection\nPoint2D c\n\n# The Corners of the Tag\nPoint2D[] p";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  apriltags2_ros.AprilTagFamily getFamily();
  void setFamily(apriltags2_ros.AprilTagFamily value);
  byte getId();
  void setId(byte value);
  byte getHamming();
  void setHamming(byte value);
  float getGoodness();
  void setGoodness(float value);
  float getDecisionMargin();
  void setDecisionMargin(float value);
  apriltags2_ros.Matrix getH();
  void setH(apriltags2_ros.Matrix value);
  apriltags2_ros.Point2D getC();
  void setC(apriltags2_ros.Point2D value);
  java.util.List<apriltags2_ros.Point2D> getP();
  void setP(java.util.List<apriltags2_ros.Point2D> value);
}
