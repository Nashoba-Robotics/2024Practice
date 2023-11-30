package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/*
 * Create a program that plays 3 notes
 *   - C (261.63Hz)
 *   - D (293.66Hz)
 *   - E (329.63Hz)
 * 
 * Each note should be played for 1 second.
 */
public class MusicTime extends CommandBase{
    Timer timer;

    public MusicTime(){
        timer = new Timer();
        // timer.start();   <-- Starts the timer
        // timer.stop();    <-- Stops the timer
        // timer.get();     <-- Gets the value of the timer
        // timer.reset();   <-- Resets the timer
    }

    //TODO: Finish the program. (HINT: You will need to use flag variables)
    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void end(boolean interrupted) {
        
    }

    @Override
    public boolean isFinished() {
        return false;   //TODO: Consider changing this condition
    }
}
