classdef CustomMsgConsts
    %CustomMsgConsts This class stores all message types
    %   The message types are constant properties, which in turn resolve
    %   to the strings of the actual types.
    
    %   Copyright 2014-2018 The MathWorks, Inc.
    
    properties (Constant)
        apriltag2_ros_AprilTagDetection = 'apriltag2_ros/AprilTagDetection'
        apriltag2_ros_AprilTagDetectionArray = 'apriltag2_ros/AprilTagDetectionArray'
        apriltag_msgs_AprilTagDetection = 'apriltag_msgs/AprilTagDetection'
        apriltag_msgs_AprilTagDetectionArray = 'apriltag_msgs/AprilTagDetectionArray'
        apriltags2_ros_AprilTagDetection = 'apriltags2_ros/AprilTagDetection'
        apriltags2_ros_AprilTagDetectionArray = 'apriltags2_ros/AprilTagDetectionArray'
        apriltags2_ros_AprilTagDetectionPose = 'apriltags2_ros/AprilTagDetectionPose'
        apriltags2_ros_AprilTagDetectionPoseArray = 'apriltags2_ros/AprilTagDetectionPoseArray'
        apriltags2_ros_AprilTagFamily = 'apriltags2_ros/AprilTagFamily'
        apriltags2_ros_Matrix = 'apriltags2_ros/Matrix'
        apriltags2_ros_Point2D = 'apriltags2_ros/Point2D'
        mavros_msgs_ADSBVehicle = 'mavros_msgs/ADSBVehicle'
        mavros_msgs_ActuatorControl = 'mavros_msgs/ActuatorControl'
        mavros_msgs_Altitude = 'mavros_msgs/Altitude'
        mavros_msgs_AttitudeTarget = 'mavros_msgs/AttitudeTarget'
        mavros_msgs_BatteryStatus = 'mavros_msgs/BatteryStatus'
        mavros_msgs_CamIMUStamp = 'mavros_msgs/CamIMUStamp'
        mavros_msgs_CommandBool = 'mavros_msgs/CommandBool'
        mavros_msgs_CommandBoolRequest = 'mavros_msgs/CommandBoolRequest'
        mavros_msgs_CommandBoolResponse = 'mavros_msgs/CommandBoolResponse'
        mavros_msgs_CommandCode = 'mavros_msgs/CommandCode'
        mavros_msgs_CommandHome = 'mavros_msgs/CommandHome'
        mavros_msgs_CommandHomeRequest = 'mavros_msgs/CommandHomeRequest'
        mavros_msgs_CommandHomeResponse = 'mavros_msgs/CommandHomeResponse'
        mavros_msgs_CommandInt = 'mavros_msgs/CommandInt'
        mavros_msgs_CommandIntRequest = 'mavros_msgs/CommandIntRequest'
        mavros_msgs_CommandIntResponse = 'mavros_msgs/CommandIntResponse'
        mavros_msgs_CommandLong = 'mavros_msgs/CommandLong'
        mavros_msgs_CommandLongRequest = 'mavros_msgs/CommandLongRequest'
        mavros_msgs_CommandLongResponse = 'mavros_msgs/CommandLongResponse'
        mavros_msgs_CommandTOL = 'mavros_msgs/CommandTOL'
        mavros_msgs_CommandTOLRequest = 'mavros_msgs/CommandTOLRequest'
        mavros_msgs_CommandTOLResponse = 'mavros_msgs/CommandTOLResponse'
        mavros_msgs_CommandTriggerControl = 'mavros_msgs/CommandTriggerControl'
        mavros_msgs_CommandTriggerControlRequest = 'mavros_msgs/CommandTriggerControlRequest'
        mavros_msgs_CommandTriggerControlResponse = 'mavros_msgs/CommandTriggerControlResponse'
        mavros_msgs_DebugValue = 'mavros_msgs/DebugValue'
        mavros_msgs_ExtendedState = 'mavros_msgs/ExtendedState'
        mavros_msgs_FileChecksum = 'mavros_msgs/FileChecksum'
        mavros_msgs_FileChecksumRequest = 'mavros_msgs/FileChecksumRequest'
        mavros_msgs_FileChecksumResponse = 'mavros_msgs/FileChecksumResponse'
        mavros_msgs_FileClose = 'mavros_msgs/FileClose'
        mavros_msgs_FileCloseRequest = 'mavros_msgs/FileCloseRequest'
        mavros_msgs_FileCloseResponse = 'mavros_msgs/FileCloseResponse'
        mavros_msgs_FileEntry = 'mavros_msgs/FileEntry'
        mavros_msgs_FileList = 'mavros_msgs/FileList'
        mavros_msgs_FileListRequest = 'mavros_msgs/FileListRequest'
        mavros_msgs_FileListResponse = 'mavros_msgs/FileListResponse'
        mavros_msgs_FileMakeDir = 'mavros_msgs/FileMakeDir'
        mavros_msgs_FileMakeDirRequest = 'mavros_msgs/FileMakeDirRequest'
        mavros_msgs_FileMakeDirResponse = 'mavros_msgs/FileMakeDirResponse'
        mavros_msgs_FileOpen = 'mavros_msgs/FileOpen'
        mavros_msgs_FileOpenRequest = 'mavros_msgs/FileOpenRequest'
        mavros_msgs_FileOpenResponse = 'mavros_msgs/FileOpenResponse'
        mavros_msgs_FileRead = 'mavros_msgs/FileRead'
        mavros_msgs_FileReadRequest = 'mavros_msgs/FileReadRequest'
        mavros_msgs_FileReadResponse = 'mavros_msgs/FileReadResponse'
        mavros_msgs_FileRemoveDir = 'mavros_msgs/FileRemoveDir'
        mavros_msgs_FileRemoveDirRequest = 'mavros_msgs/FileRemoveDirRequest'
        mavros_msgs_FileRemoveDirResponse = 'mavros_msgs/FileRemoveDirResponse'
        mavros_msgs_FileRemove = 'mavros_msgs/FileRemove'
        mavros_msgs_FileRemoveRequest = 'mavros_msgs/FileRemoveRequest'
        mavros_msgs_FileRemoveResponse = 'mavros_msgs/FileRemoveResponse'
        mavros_msgs_FileRename = 'mavros_msgs/FileRename'
        mavros_msgs_FileRenameRequest = 'mavros_msgs/FileRenameRequest'
        mavros_msgs_FileRenameResponse = 'mavros_msgs/FileRenameResponse'
        mavros_msgs_FileTruncate = 'mavros_msgs/FileTruncate'
        mavros_msgs_FileTruncateRequest = 'mavros_msgs/FileTruncateRequest'
        mavros_msgs_FileTruncateResponse = 'mavros_msgs/FileTruncateResponse'
        mavros_msgs_FileWrite = 'mavros_msgs/FileWrite'
        mavros_msgs_FileWriteRequest = 'mavros_msgs/FileWriteRequest'
        mavros_msgs_FileWriteResponse = 'mavros_msgs/FileWriteResponse'
        mavros_msgs_GlobalPositionTarget = 'mavros_msgs/GlobalPositionTarget'
        mavros_msgs_HilActuatorControls = 'mavros_msgs/HilActuatorControls'
        mavros_msgs_HilControls = 'mavros_msgs/HilControls'
        mavros_msgs_HilGPS = 'mavros_msgs/HilGPS'
        mavros_msgs_HilSensor = 'mavros_msgs/HilSensor'
        mavros_msgs_HilStateQuaternion = 'mavros_msgs/HilStateQuaternion'
        mavros_msgs_HomePosition = 'mavros_msgs/HomePosition'
        mavros_msgs_ManualControl = 'mavros_msgs/ManualControl'
        mavros_msgs_Mavlink = 'mavros_msgs/Mavlink'
        mavros_msgs_OpticalFlowRad = 'mavros_msgs/OpticalFlowRad'
        mavros_msgs_OverrideRCIn = 'mavros_msgs/OverrideRCIn'
        mavros_msgs_ParamGet = 'mavros_msgs/ParamGet'
        mavros_msgs_ParamGetRequest = 'mavros_msgs/ParamGetRequest'
        mavros_msgs_ParamGetResponse = 'mavros_msgs/ParamGetResponse'
        mavros_msgs_ParamPull = 'mavros_msgs/ParamPull'
        mavros_msgs_ParamPullRequest = 'mavros_msgs/ParamPullRequest'
        mavros_msgs_ParamPullResponse = 'mavros_msgs/ParamPullResponse'
        mavros_msgs_ParamPush = 'mavros_msgs/ParamPush'
        mavros_msgs_ParamPushRequest = 'mavros_msgs/ParamPushRequest'
        mavros_msgs_ParamPushResponse = 'mavros_msgs/ParamPushResponse'
        mavros_msgs_ParamSet = 'mavros_msgs/ParamSet'
        mavros_msgs_ParamSetRequest = 'mavros_msgs/ParamSetRequest'
        mavros_msgs_ParamSetResponse = 'mavros_msgs/ParamSetResponse'
        mavros_msgs_ParamValue = 'mavros_msgs/ParamValue'
        mavros_msgs_PositionTarget = 'mavros_msgs/PositionTarget'
        mavros_msgs_RCIn = 'mavros_msgs/RCIn'
        mavros_msgs_RCOut = 'mavros_msgs/RCOut'
        mavros_msgs_RadioStatus = 'mavros_msgs/RadioStatus'
        mavros_msgs_SetMavFrame = 'mavros_msgs/SetMavFrame'
        mavros_msgs_SetMavFrameRequest = 'mavros_msgs/SetMavFrameRequest'
        mavros_msgs_SetMavFrameResponse = 'mavros_msgs/SetMavFrameResponse'
        mavros_msgs_SetMode = 'mavros_msgs/SetMode'
        mavros_msgs_SetModeRequest = 'mavros_msgs/SetModeRequest'
        mavros_msgs_SetModeResponse = 'mavros_msgs/SetModeResponse'
        mavros_msgs_State = 'mavros_msgs/State'
        mavros_msgs_StatusText = 'mavros_msgs/StatusText'
        mavros_msgs_StreamRate = 'mavros_msgs/StreamRate'
        mavros_msgs_StreamRateRequest = 'mavros_msgs/StreamRateRequest'
        mavros_msgs_StreamRateResponse = 'mavros_msgs/StreamRateResponse'
        mavros_msgs_Thrust = 'mavros_msgs/Thrust'
        mavros_msgs_TimesyncStatus = 'mavros_msgs/TimesyncStatus'
        mavros_msgs_Trajectory = 'mavros_msgs/Trajectory'
        mavros_msgs_VFR_HUD = 'mavros_msgs/VFR_HUD'
        mavros_msgs_Vibration = 'mavros_msgs/Vibration'
        mavros_msgs_Waypoint = 'mavros_msgs/Waypoint'
        mavros_msgs_WaypointClear = 'mavros_msgs/WaypointClear'
        mavros_msgs_WaypointClearRequest = 'mavros_msgs/WaypointClearRequest'
        mavros_msgs_WaypointClearResponse = 'mavros_msgs/WaypointClearResponse'
        mavros_msgs_WaypointList = 'mavros_msgs/WaypointList'
        mavros_msgs_WaypointPull = 'mavros_msgs/WaypointPull'
        mavros_msgs_WaypointPullRequest = 'mavros_msgs/WaypointPullRequest'
        mavros_msgs_WaypointPullResponse = 'mavros_msgs/WaypointPullResponse'
        mavros_msgs_WaypointPush = 'mavros_msgs/WaypointPush'
        mavros_msgs_WaypointPushRequest = 'mavros_msgs/WaypointPushRequest'
        mavros_msgs_WaypointPushResponse = 'mavros_msgs/WaypointPushResponse'
        mavros_msgs_WaypointReached = 'mavros_msgs/WaypointReached'
        mavros_msgs_WaypointSetCurrent = 'mavros_msgs/WaypointSetCurrent'
        mavros_msgs_WaypointSetCurrentRequest = 'mavros_msgs/WaypointSetCurrentRequest'
        mavros_msgs_WaypointSetCurrentResponse = 'mavros_msgs/WaypointSetCurrentResponse'
        opencv_apps_Circle = 'opencv_apps/Circle'
        opencv_apps_CircleArray = 'opencv_apps/CircleArray'
        opencv_apps_CircleArrayStamped = 'opencv_apps/CircleArrayStamped'
        opencv_apps_Contour = 'opencv_apps/Contour'
        opencv_apps_ContourArray = 'opencv_apps/ContourArray'
        opencv_apps_ContourArrayStamped = 'opencv_apps/ContourArrayStamped'
        opencv_apps_Face = 'opencv_apps/Face'
        opencv_apps_FaceArray = 'opencv_apps/FaceArray'
        opencv_apps_FaceArrayStamped = 'opencv_apps/FaceArrayStamped'
        opencv_apps_Flow = 'opencv_apps/Flow'
        opencv_apps_FlowArray = 'opencv_apps/FlowArray'
        opencv_apps_FlowArrayStamped = 'opencv_apps/FlowArrayStamped'
        opencv_apps_FlowStamped = 'opencv_apps/FlowStamped'
        opencv_apps_Line = 'opencv_apps/Line'
        opencv_apps_LineArray = 'opencv_apps/LineArray'
        opencv_apps_LineArrayStamped = 'opencv_apps/LineArrayStamped'
        opencv_apps_Moment = 'opencv_apps/Moment'
        opencv_apps_MomentArray = 'opencv_apps/MomentArray'
        opencv_apps_MomentArrayStamped = 'opencv_apps/MomentArrayStamped'
        opencv_apps_Point2D = 'opencv_apps/Point2D'
        opencv_apps_Point2DArray = 'opencv_apps/Point2DArray'
        opencv_apps_Point2DArrayStamped = 'opencv_apps/Point2DArrayStamped'
        opencv_apps_Point2DStamped = 'opencv_apps/Point2DStamped'
        opencv_apps_Rect = 'opencv_apps/Rect'
        opencv_apps_RectArray = 'opencv_apps/RectArray'
        opencv_apps_RectArrayStamped = 'opencv_apps/RectArrayStamped'
        opencv_apps_RotatedRect = 'opencv_apps/RotatedRect'
        opencv_apps_RotatedRectArray = 'opencv_apps/RotatedRectArray'
        opencv_apps_RotatedRectArrayStamped = 'opencv_apps/RotatedRectArrayStamped'
        opencv_apps_RotatedRectStamped = 'opencv_apps/RotatedRectStamped'
        opencv_apps_Size = 'opencv_apps/Size'
    end
    
    methods (Static, Hidden)
        function messageList = getMessageList
            %getMessageList Generate a cell array with all message types.
            %   The list will be sorted alphabetically.
            
            persistent msgList
            if isempty(msgList)
                msgList = cell(134, 1);
                msgList{1} = 'apriltag2_ros/AprilTagDetection';
                msgList{2} = 'apriltag2_ros/AprilTagDetectionArray';
                msgList{3} = 'apriltag_msgs/AprilTagDetection';
                msgList{4} = 'apriltag_msgs/AprilTagDetectionArray';
                msgList{5} = 'apriltags2_ros/AprilTagDetection';
                msgList{6} = 'apriltags2_ros/AprilTagDetectionArray';
                msgList{7} = 'apriltags2_ros/AprilTagDetectionPose';
                msgList{8} = 'apriltags2_ros/AprilTagDetectionPoseArray';
                msgList{9} = 'apriltags2_ros/AprilTagFamily';
                msgList{10} = 'apriltags2_ros/Matrix';
                msgList{11} = 'apriltags2_ros/Point2D';
                msgList{12} = 'mavros_msgs/ADSBVehicle';
                msgList{13} = 'mavros_msgs/ActuatorControl';
                msgList{14} = 'mavros_msgs/Altitude';
                msgList{15} = 'mavros_msgs/AttitudeTarget';
                msgList{16} = 'mavros_msgs/BatteryStatus';
                msgList{17} = 'mavros_msgs/CamIMUStamp';
                msgList{18} = 'mavros_msgs/CommandBoolRequest';
                msgList{19} = 'mavros_msgs/CommandBoolResponse';
                msgList{20} = 'mavros_msgs/CommandCode';
                msgList{21} = 'mavros_msgs/CommandHomeRequest';
                msgList{22} = 'mavros_msgs/CommandHomeResponse';
                msgList{23} = 'mavros_msgs/CommandIntRequest';
                msgList{24} = 'mavros_msgs/CommandIntResponse';
                msgList{25} = 'mavros_msgs/CommandLongRequest';
                msgList{26} = 'mavros_msgs/CommandLongResponse';
                msgList{27} = 'mavros_msgs/CommandTOLRequest';
                msgList{28} = 'mavros_msgs/CommandTOLResponse';
                msgList{29} = 'mavros_msgs/CommandTriggerControlRequest';
                msgList{30} = 'mavros_msgs/CommandTriggerControlResponse';
                msgList{31} = 'mavros_msgs/DebugValue';
                msgList{32} = 'mavros_msgs/ExtendedState';
                msgList{33} = 'mavros_msgs/FileChecksumRequest';
                msgList{34} = 'mavros_msgs/FileChecksumResponse';
                msgList{35} = 'mavros_msgs/FileCloseRequest';
                msgList{36} = 'mavros_msgs/FileCloseResponse';
                msgList{37} = 'mavros_msgs/FileEntry';
                msgList{38} = 'mavros_msgs/FileListRequest';
                msgList{39} = 'mavros_msgs/FileListResponse';
                msgList{40} = 'mavros_msgs/FileMakeDirRequest';
                msgList{41} = 'mavros_msgs/FileMakeDirResponse';
                msgList{42} = 'mavros_msgs/FileOpenRequest';
                msgList{43} = 'mavros_msgs/FileOpenResponse';
                msgList{44} = 'mavros_msgs/FileReadRequest';
                msgList{45} = 'mavros_msgs/FileReadResponse';
                msgList{46} = 'mavros_msgs/FileRemoveDirRequest';
                msgList{47} = 'mavros_msgs/FileRemoveDirResponse';
                msgList{48} = 'mavros_msgs/FileRemoveRequest';
                msgList{49} = 'mavros_msgs/FileRemoveResponse';
                msgList{50} = 'mavros_msgs/FileRenameRequest';
                msgList{51} = 'mavros_msgs/FileRenameResponse';
                msgList{52} = 'mavros_msgs/FileTruncateRequest';
                msgList{53} = 'mavros_msgs/FileTruncateResponse';
                msgList{54} = 'mavros_msgs/FileWriteRequest';
                msgList{55} = 'mavros_msgs/FileWriteResponse';
                msgList{56} = 'mavros_msgs/GlobalPositionTarget';
                msgList{57} = 'mavros_msgs/HilActuatorControls';
                msgList{58} = 'mavros_msgs/HilControls';
                msgList{59} = 'mavros_msgs/HilGPS';
                msgList{60} = 'mavros_msgs/HilSensor';
                msgList{61} = 'mavros_msgs/HilStateQuaternion';
                msgList{62} = 'mavros_msgs/HomePosition';
                msgList{63} = 'mavros_msgs/ManualControl';
                msgList{64} = 'mavros_msgs/Mavlink';
                msgList{65} = 'mavros_msgs/OpticalFlowRad';
                msgList{66} = 'mavros_msgs/OverrideRCIn';
                msgList{67} = 'mavros_msgs/ParamGetRequest';
                msgList{68} = 'mavros_msgs/ParamGetResponse';
                msgList{69} = 'mavros_msgs/ParamPullRequest';
                msgList{70} = 'mavros_msgs/ParamPullResponse';
                msgList{71} = 'mavros_msgs/ParamPushRequest';
                msgList{72} = 'mavros_msgs/ParamPushResponse';
                msgList{73} = 'mavros_msgs/ParamSetRequest';
                msgList{74} = 'mavros_msgs/ParamSetResponse';
                msgList{75} = 'mavros_msgs/ParamValue';
                msgList{76} = 'mavros_msgs/PositionTarget';
                msgList{77} = 'mavros_msgs/RCIn';
                msgList{78} = 'mavros_msgs/RCOut';
                msgList{79} = 'mavros_msgs/RadioStatus';
                msgList{80} = 'mavros_msgs/SetMavFrameRequest';
                msgList{81} = 'mavros_msgs/SetMavFrameResponse';
                msgList{82} = 'mavros_msgs/SetModeRequest';
                msgList{83} = 'mavros_msgs/SetModeResponse';
                msgList{84} = 'mavros_msgs/State';
                msgList{85} = 'mavros_msgs/StatusText';
                msgList{86} = 'mavros_msgs/StreamRateRequest';
                msgList{87} = 'mavros_msgs/StreamRateResponse';
                msgList{88} = 'mavros_msgs/Thrust';
                msgList{89} = 'mavros_msgs/TimesyncStatus';
                msgList{90} = 'mavros_msgs/Trajectory';
                msgList{91} = 'mavros_msgs/VFR_HUD';
                msgList{92} = 'mavros_msgs/Vibration';
                msgList{93} = 'mavros_msgs/Waypoint';
                msgList{94} = 'mavros_msgs/WaypointClearRequest';
                msgList{95} = 'mavros_msgs/WaypointClearResponse';
                msgList{96} = 'mavros_msgs/WaypointList';
                msgList{97} = 'mavros_msgs/WaypointPullRequest';
                msgList{98} = 'mavros_msgs/WaypointPullResponse';
                msgList{99} = 'mavros_msgs/WaypointPushRequest';
                msgList{100} = 'mavros_msgs/WaypointPushResponse';
                msgList{101} = 'mavros_msgs/WaypointReached';
                msgList{102} = 'mavros_msgs/WaypointSetCurrentRequest';
                msgList{103} = 'mavros_msgs/WaypointSetCurrentResponse';
                msgList{104} = 'opencv_apps/Circle';
                msgList{105} = 'opencv_apps/CircleArray';
                msgList{106} = 'opencv_apps/CircleArrayStamped';
                msgList{107} = 'opencv_apps/Contour';
                msgList{108} = 'opencv_apps/ContourArray';
                msgList{109} = 'opencv_apps/ContourArrayStamped';
                msgList{110} = 'opencv_apps/Face';
                msgList{111} = 'opencv_apps/FaceArray';
                msgList{112} = 'opencv_apps/FaceArrayStamped';
                msgList{113} = 'opencv_apps/Flow';
                msgList{114} = 'opencv_apps/FlowArray';
                msgList{115} = 'opencv_apps/FlowArrayStamped';
                msgList{116} = 'opencv_apps/FlowStamped';
                msgList{117} = 'opencv_apps/Line';
                msgList{118} = 'opencv_apps/LineArray';
                msgList{119} = 'opencv_apps/LineArrayStamped';
                msgList{120} = 'opencv_apps/Moment';
                msgList{121} = 'opencv_apps/MomentArray';
                msgList{122} = 'opencv_apps/MomentArrayStamped';
                msgList{123} = 'opencv_apps/Point2D';
                msgList{124} = 'opencv_apps/Point2DArray';
                msgList{125} = 'opencv_apps/Point2DArrayStamped';
                msgList{126} = 'opencv_apps/Point2DStamped';
                msgList{127} = 'opencv_apps/Rect';
                msgList{128} = 'opencv_apps/RectArray';
                msgList{129} = 'opencv_apps/RectArrayStamped';
                msgList{130} = 'opencv_apps/RotatedRect';
                msgList{131} = 'opencv_apps/RotatedRectArray';
                msgList{132} = 'opencv_apps/RotatedRectArrayStamped';
                msgList{133} = 'opencv_apps/RotatedRectStamped';
                msgList{134} = 'opencv_apps/Size';
            end
            
            messageList = msgList;
        end
        
        function serviceList = getServiceList
            %getServiceList Generate a cell array with all service types.
            %   The list will be sorted alphabetically.
            
            persistent svcList
            if isempty(svcList)
                svcList = cell(28, 1);
                svcList{1} = 'mavros_msgs/CommandBool';
                svcList{2} = 'mavros_msgs/CommandHome';
                svcList{3} = 'mavros_msgs/CommandInt';
                svcList{4} = 'mavros_msgs/CommandLong';
                svcList{5} = 'mavros_msgs/CommandTOL';
                svcList{6} = 'mavros_msgs/CommandTriggerControl';
                svcList{7} = 'mavros_msgs/FileChecksum';
                svcList{8} = 'mavros_msgs/FileClose';
                svcList{9} = 'mavros_msgs/FileList';
                svcList{10} = 'mavros_msgs/FileMakeDir';
                svcList{11} = 'mavros_msgs/FileOpen';
                svcList{12} = 'mavros_msgs/FileRead';
                svcList{13} = 'mavros_msgs/FileRemoveDir';
                svcList{14} = 'mavros_msgs/FileRemove';
                svcList{15} = 'mavros_msgs/FileRename';
                svcList{16} = 'mavros_msgs/FileTruncate';
                svcList{17} = 'mavros_msgs/FileWrite';
                svcList{18} = 'mavros_msgs/ParamGet';
                svcList{19} = 'mavros_msgs/ParamPull';
                svcList{20} = 'mavros_msgs/ParamPush';
                svcList{21} = 'mavros_msgs/ParamSet';
                svcList{22} = 'mavros_msgs/SetMavFrame';
                svcList{23} = 'mavros_msgs/SetMode';
                svcList{24} = 'mavros_msgs/StreamRate';
                svcList{25} = 'mavros_msgs/WaypointClear';
                svcList{26} = 'mavros_msgs/WaypointPull';
                svcList{27} = 'mavros_msgs/WaypointPush';
                svcList{28} = 'mavros_msgs/WaypointSetCurrent';
            end
            
            % The message list was already sorted, so don't need to sort
            % again.
            serviceList = svcList;
        end
        
        function actionList = getActionList
            %getActionList Generate a cell array with all action types.
            %   The list will be sorted alphabetically.
            
            persistent actList
            if isempty(actList)
                actList = cell(0, 1);
            end
            
            % The message list was already sorted, so don't need to sort
            % again.
            actionList = actList;
        end
    end
end
