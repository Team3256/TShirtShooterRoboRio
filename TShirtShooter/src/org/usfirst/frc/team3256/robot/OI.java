package org.usfirst.frc.team3256.robot;

import org.usfirst.frc.team3256.robot.commands.FireAll;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//define joystick
	static Joystick joystick = new Joystick(0);
    
    //define the buttons
    Button buttonA = new JoystickButton(joystick, 1),
    		buttonB = new JoystickButton(joystick, 2),
    		buttonX = new JoystickButton(joystick, 3),
    		buttonY = new JoystickButton(joystick, 4),
    		buttonLB = new JoystickButton(joystick, 5),
    		buttonRB = new JoystickButton(joystick, 6),
    		buttonBack = new JoystickButton(joystick, 7),
    		buttonStart = new JoystickButton(joystick, 8),
    		buttonLeftStick = new JoystickButton(joystick, 9),
    		buttonRightStick = new JoystickButton(joystick, 10);
    
    //make joystick methods
    public static double getLeftY(){return joystick.getRawAxis(1);}
    public static double getLeftX(){return joystick.getRawAxis(2);}
    public static double getRightY(){return joystick.getRawAxis(5);}
    public static double getRightX(){return joystick.getRawAxis(4);}
    
    public static boolean getButtonA(){return joystick.getRawButton(1);}
    public static boolean getButtonB(){return joystick.getRawButton(2);}
    public static boolean getButtonX(){return joystick.getRawButton(3);}
    public static boolean getButtonY(){return joystick.getRawButton(4);}
    public static boolean getButtonLB(){return joystick.getRawButton(5);}
    public static boolean getButtonRB(){return joystick.getRawButton(6);}
    public static boolean getButtonBack(){return joystick.getRawButton(7);}
    public static boolean getButtonstart(){return joystick.getRawButton(8);}
    
    public static boolean getRightTrigger(){return joystick.getRawAxis(3) > 0.5;}
    public static boolean getLeftTrigger(){return joystick.getZ() > 0.5;}
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

