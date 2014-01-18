/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author tj2
 */
public class Lights extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public boolean setReadyToShoot(){
        //turns on a light to tell driver if ready to shoot
        return false;
        //temporary!
    }
    public void clearReadyToShoot(){
        //turns off ready to shoot light 
    }
    
    
    public void allOff(){
        //turns all lights off
    }
    public void allOn(){
        //turns all lights on!
    }
    public boolean celebrate(){
        //strobes all lights when score
        return false;
                //coming soon
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
