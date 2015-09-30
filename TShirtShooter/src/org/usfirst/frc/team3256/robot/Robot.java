
package org.usfirst.frc.team3256.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3256.robot.commands.FireAll;
import org.usfirst.frc.team3256.robot.commands.TankDrive;
import org.usfirst.frc.team3256.robot.subsystems.Actuators;
import org.usfirst.frc.team3256.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3256.robot.subsystems.Shooter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	//public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	
	public static Drivetrain drivetrain;
	public static OI oi;
	public static Subsystem actuators;
	
	int looper = 20;
	int shooterLooper = 20;
	int power = 30;

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		
        // instantiate the command used for the autonomous period
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        //Scheduler.getInstance().run();
    	
    	SmartDashboard.putNumber("Power: ", power);
    	System.out.println("Power: " + power);
    	
    	if (looper > 0){looper--;}
    	if (shooterLooper > 0){shooterLooper--;}
    	
    	drivetrain.tankDrive(OI.getLeftY(), OI.getRightY());
        
    	if (OI.getButtonRB()){
    		power += 2;
    	}
    	if (OI.getButtonLB()){
    		power -= 2;
    	}
        if (OI.getButtonB() && looper == 0){
        	Actuators.fireRightPancake();
        	looper = 50;
        }
        if (OI.getButtonX() && looper == 0){
        	Actuators.fireLeftPancake();
        	looper = 50;
        }
        if (OI.getButtonY() && looper == 0){
        	Actuators.toggleRightLong();
        	looper = 50;
        }
        if (OI.getButtonA() && looper == 0){
        	Actuators.toggleLeftLong();
        	looper = 50;
        }
        if (OI.getRightTrigger() && shooterLooper == 0){
        	Shooter.fireRight(power);
        	shooterLooper=20;
        }
        if (OI.getLeftTrigger() && shooterLooper == 0){
        	Shooter.fireLeft(power);
        	shooterLooper=20;
        }

        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
