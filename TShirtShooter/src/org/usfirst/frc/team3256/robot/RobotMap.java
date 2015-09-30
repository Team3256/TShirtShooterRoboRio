package org.usfirst.frc.team3256.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //motor ports
	public static int leftMotorFront = 0;
    public static int leftMotorRear = 1;
    public static int rightMotorFront = 4;
    public static int rightMotorRear = 3;
    public static int shooterMotor = 2;
    
    //actuator ports
    public static int leftInPancake = 1;
    public static int leftOutPancake = 6;
    public static int rightInPancake = 0;
    public static int rightOutPancake = 7;
    
    public static int leftInLong = 3;
    public static int leftOutLong = 4;
    public static int rightInLong = 2;
    public static int rightOutLong = 5;
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
