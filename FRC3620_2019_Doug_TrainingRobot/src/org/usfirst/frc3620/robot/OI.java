// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3620.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc3620.misc.XBoxConstants;
import org.usfirst.frc3620.robot.commands.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick joystick0;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // ********************************* ok to add here!!!!
    public JoystickButton joystickButtonA;
    // ********************************* no longer ok to add!!!
    
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick0 = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("ButtonACommand", new ButtonACommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        // ********************************* ok to add here!!!!
        
        joystickButtonA = new JoystickButton(joystick0, XBoxConstants.BUTTON_A);
        joystickButtonA.whileHeld(new ButtonACommand());

        SmartDashboard.putData("ButtonACommand", new ButtonACommand());

        // ********************************* no longer ok to add!!!
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick0() {
        return joystick0;
    }
    public double getLeftVerticalJoystick() {
    	double rv = -joystick0.getRawAxis(1);
    	if ((rv > 0.2) || (rv < -0.2)) {
    		return rv;
    	}
    	return 0;
    }
    public double getRightVerticalJoystick() {
    	double rv = -joystick0.getRawAxis(5);
    	if ((rv > 0.2) || (rv < -0.2)) {
    		return rv;
    	}
    	return 0;
    }
    public double getRightHorizontalJoystick() {
    	double rv = joystick0.getRawAxis(4);
    	if ((rv > 0.2) || (rv < -0.2)) {
    		return rv;
    	}
    	return 0;
    }
    public double getLeftHorizontalJoystick() {
    	double rv = joystick0.getRawAxis(0);
    	if ((rv > 0.2) || (rv < -0.2)) {
    		return rv;
    	}
    	return 0;
    }
    public double getLeftHorizontalJoystickSquared() {
    	double rv = joystick0.getRawAxis(0);
    	double rvRef = rv;
    	if ((rv > 0.2) || (rv < -0.2)) {
    		rv = rv*rv;
    		if(rvRef < 0) {
    			rv = -rv;
    		}
    		return rv;
    	}
    	return 0;
    }
    public double getLeftVerticalJoystickSquared() {
    	double rv = joystick0.getRawAxis(0);
    	
    	double rvRef = rv;
    	double test = rvRef;
    	System.out.println(test);
    	if ((rv > 0.2) || (rv < -0.2)) {
    		rv = rv*rv;
    		if(rvRef < 0) {
    			rv = -rv;
    		}
    		System.out.println(rv);
    		return rv;
    		
    	}
    	return 0;
    }
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

