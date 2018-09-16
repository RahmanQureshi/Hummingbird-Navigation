package mavros_msgs;

public interface FileRemove$Service extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileRemove$Service";
  static final java.lang.String _DEFINITION = "# FTP::Remove\n#\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring file_path\n---\nbool success\nint32 r_errno\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
}
