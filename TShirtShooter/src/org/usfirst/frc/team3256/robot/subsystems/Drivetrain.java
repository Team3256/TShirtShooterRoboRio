package org.usfirst.frc.team3256.robot.subsystems;

import org.usfirst.frc.team3256.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
     
	static Talon leftFront = new Talon(RobotMap.leftMotorFront);
	static Talon leftRear = new Talon(RobotMap.leftMotorRear);
	static Talon rightFront = new Talon(RobotMap.rightMotorFront);
	static Talon rightRear = new Talon(RobotMap.rightMotorRear);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static void tankDrive(double left, double right){
    	System.out.println("Left: " + left + "    Right: " + right);
    	if (Math.abs(right) < 0.15){right = 0;}
    	if (Math.abs(left) < 0.15){left = 0;}
    	leftFront.set(-left);
    	leftRear.set(-left);
    	rightFront.set(right);
    	rightRear.set(right);
    }
}

