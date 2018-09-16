package apriltags2_ros;

public interface AprilTagFamily extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "apriltags2_ros/AprilTagFamily";
  static final java.lang.String _DEFINITION = "# Number of codes in this tag family\nuint32 ncodes\n\n# The codes in the family\nuint64[] codes\n\n# How wide is the black border\nuint32 black_border\n\n# How many bits tall and wide it is\nuint32 d\n\n# The mininum hamming distance between any two codes\nuint32 h\n\n# A human readable name\nstring name";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  int getNcodes();
  void setNcodes(int value);
  long[] getCodes();
  void setCodes(long[] value);
  int getBlackBorder();
  void setBlackBorder(int value);
  int getD();
  void setD(int value);
  int getH();
  void setH(int value);
  java.lang.String getName();
  void setName(java.lang.String value);
}
