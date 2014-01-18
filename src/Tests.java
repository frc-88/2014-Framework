/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tj2
 */
public class Tests extends CommandBase {
    
    public Tests() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    Retriever retriever = new Retriever();
    Pele kicker = new Pele();
    
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
    public boolean ready(){
        public boolean isBallIn = retriever.isBallIn();
        kicker.tension();
        return isBallIn;
}
    public boolean aim(){
        //uses camera, tilt, and field position
        return false;
}
    public void shoot(){
        //lifts arm
        //kick
        //reset at end
}
    
    
    
}
