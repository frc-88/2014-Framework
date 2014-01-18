/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tj2
 */
public class Retriever extends CommandBase {
    
    public Retriever() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

      
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    public void spinIn() {
    //pulls ball in
    }
    public void spinOut(){
    //pushes ball out
    }
    public boolean isBallIn(){
    //tells if ball is in using a sensor
        return false;
        //temporary!
    }
    public void liftArm(){
    //lifts arm up
    }
    public void dropArm(){
    //drops arm down
    }
    
    
    
    
    }
    
