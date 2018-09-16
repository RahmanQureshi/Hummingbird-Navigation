package apriltags2_ros;

public interface Matrix extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "apriltags2_ros/Matrix";
  static final java.lang.String _DEFINITION = "int8 nrows\nint8 ncols\nfloat64[] data";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  byte getNrows();
  void setNrows(byte value);
  byte getNcols();
  void setNcols(byte value);
  double[] getData();
  void setData(double[] value);
}
