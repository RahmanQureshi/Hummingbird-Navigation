rosshutdown

% Gazebo IP address
gazeboIp = '192.168.42.220';
localIp = '192.168.42.121';

% Connection
setenv('ROS_IP', localIp)
setenv('ROS_MASTER_URI',strcat('http://', gazeboIp, ':11311'))
rosinit(gazeboIp, 'NodeHost', localIp)