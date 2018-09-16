package mavros_msgs;

public interface FileRenameRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileRenameRequest";
  static final java.lang.String _DEFINITION = "# FTP::Rename\n#\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring old_path\nstring new_path\n";
  static final boolean _IS_SERVICE = true;
  static final boolean _IS_ACTION = false;
  java.lang.String getOldPath();
  void setOldPath(java.lang.String value);
  java.lang.String getNewPath();
  void setNewPath(java.lang.String value);
}
