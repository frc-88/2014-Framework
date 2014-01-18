/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author tj2
 */
public class Pele extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void tension(){
    //pulls back kicker
    }
    public void kick(){
        //releaces kicker to kick the ball
    }
    public void reset(){
        //resets kicker to resting position
    }
    public void tiltUp(){
        //tilts kicker up
    }
    public void tiltDown(){
        //tilts kicker down
    }
    
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
