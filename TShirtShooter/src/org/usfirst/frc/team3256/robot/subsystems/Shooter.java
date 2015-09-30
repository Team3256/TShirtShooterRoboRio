package org.usfirst.frc.team3256.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
	static Relay rightShooter = new Relay (0, Relay.Direction.kForward);
	static Relay leftShooter = new Relay (1, Relay.Direction.kForward);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static void fireRight (long time){
    	rightShooter.set(Relay.Value.kForward);
    	try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	rightShooter.set(Relay.Value.kOff);
    }
    public static void fireLeft (long time){
    	leftShooter.set(Relay.Value.kForward);
    	try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	leftShooter.set(Relay.Value.kOff);
    }
}

