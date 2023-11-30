package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SecretSubsystem;

/*
 * Create a command that uses the input to move the motor at a specific percent
 */
public class MoveMotorCommand extends CommandBase{
    @Override
    public void initialize() {
        //Puts a widget onto Shuffleboard labeled Speed
        SmartDashboard.putNumber("Speed", 0);
        //                     name ^        ^ default value
    }

    @Override
    public void execute() {
        //          Name of the widget (Case sensitive) v       v Default value
        double speed = SmartDashboard.getNumber("Speed", 0); //<-- gets the value in the widget we created
        //     ^ This VARIABLE STORES the value we get from shuffleboard 


        //TODO: Use the speed and the SecretSubsystem to move the motor at the input speed
        // * This isn't hard, and isn't a trick. Just add 1 line.


        
    }

    @Override
    public void end(boolean interrupted) {
        SecretSubsystem.getInstance().set(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
