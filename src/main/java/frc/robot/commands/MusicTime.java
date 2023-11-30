package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SecretSubsystem;

/*
 * Create a program that plays 3 notes
 *   - C (261.63Hz)
 *   - D (293.66Hz)
 *   - E (329.63Hz)
 * 
 * Each note should be played for 1 second.
 */
public class MusicTime extends CommandBase{
    javax.management.timer.Timer timer;

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
        timer.start();
    }

    @Override
    public void execute() {
        if(timer.get() <= 1){
            SecretSubsystem.getinstance().setSound(261.63);
        }
        else if(timer.get() <= 2){
            SecretSubsystem.getinstance().setSound(293.66);
        }
        else if(timer.get <= 3){
            SecretSubsystem.getinstance().setSound(329.63);
        }
    }

    @Override
    public void end(boolean interrupted) {
        
    }

    @Override
    public boolean isFinished() {
        return timer.get() > 3;   //TODO: Consider changing this condition
    }
}
