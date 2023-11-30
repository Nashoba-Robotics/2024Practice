package frc.robot.subsystems;


import javax.management.ConstructorParameters;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SecretSubsystem extends SubsystemBase{
    private TalonFX motor;

    public SecretSubsystem(){
        motor = new TalonFX(0);
    }

    private static SecretSubsystem instance;
    public static SecretSubsystem getInstance(){
        if(instance == null) instance = new SecretSubsystem();
        return instance;
    }


    /*
     * Sets the speed of the motor
     * @Param {double}  speed - Speed in percent (-1 to 1) to set the motor to
     * 
     */
    public void set(double speed){
        motor.set(ControlMode.PercentOutput, speed);
    }

    /*
     * Returns the output in percent of the motor
     */
    public double getOutputPercent(){
        return motor.getMotorOutputPercent();
    }

    /*
     * Controls the motor by setting it to a specific frequency
     * @Param {double}  freq - Frequency to set the motor to
     */
    public void setSound(double freq){
        motor.set(ControlMode.MusicTone, freq);
    }

    
}
