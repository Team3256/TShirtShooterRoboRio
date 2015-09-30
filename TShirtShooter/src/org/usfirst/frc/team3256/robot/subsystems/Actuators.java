package org.usfirst.frc.team3256.robot.subsystems;

import org.usfirst.frc.team3256.robot.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Actuators extends Subsystem {
    
	static DoubleSolenoid rightPancake = new DoubleSolenoid (RobotMap.rightInPancake, RobotMap.rightOutPancake);
	static DoubleSolenoid leftPancake = new DoubleSolenoid (RobotMap.leftInPancake, RobotMap.leftOutPancake);
	static DoubleSolenoid rightLong = new DoubleSolenoid (RobotMap.rightInLong, RobotMap.rightOutLong);
	static DoubleSolenoid leftLong = new DoubleSolenoid (RobotMap.leftInLong, RobotMap.leftOutLong);
	static boolean a = true;
	static boolean b = true;
	static boolean c = true;
	static boolean d = true;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static void fireRightPancake(){
    		rightPancake.set(DoubleSolenoid.Value.kReverse);
    		try {
    			Thread.sleep(200);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		rightPancake.set(DoubleSolenoid.Value.kForward);
    }
    public static void fireLeftPancake(){
		leftPancake.set(DoubleSolenoid.Value.kReverse);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		leftPancake.set(DoubleSolenoid.Value.kForward);
    }
    public static void toggleRightLong(){
    	if (c){
    		rightLong.set(DoubleSolenoid.Value.kForward);
    		c = false;
    	}
    	else if (!c){
    		rightLong.set(DoubleSolenoid.Value.kReverse);
    		c = true;
    	}
    }
    public static void toggleLeftLong(){
    	if (d){
    		leftLong.set(DoubleSolenoid.Value.kForward);
    		d = false;
    	}
    	else if (!d){
    		leftLong.set(DoubleSolenoid.Value.kReverse);
    		d = true;
    	}
    }

}

