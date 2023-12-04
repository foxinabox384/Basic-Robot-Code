package frc.robot.commands;
import frc.robot.subsystems.ArmSubsystem;

public class TestArmCommand {
    private int ticks;
    public void initialize() {
        System.out.println("begin test arm command");
        ticks = 0;
    }
    public void execution() {
        ticks++;
        if(ticks < 600){
            this.subsystem.ArmSubsystem.Set_Both(Math.sin(ticks), Math.cos(ticks));
        } 
        else{
            this.subsystem.ArmSubsystem.stopAllMotors();
        }
    }

}
