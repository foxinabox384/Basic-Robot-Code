package frc.robot.subsystems;
import frc.robot.Constants.PortConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;



public class ArmSubsystem {
    private final CANSparkMax Motor1;
    private final CANSparkMax Motor2;
    public ArmSubsystem() {
        this.Motor1 = new CANSparkMax(PortConstants.PORT_1, MotorType.kBrushless);
        this.Motor2 = new CANSparkMax(PortConstants.PORT_2, MotorType.kBrushless);
    }
    public void Motor1_Speed(int speed) {
        this.Motor1.set(speed);
    }
    public void Motor2_Speed(int speed) {
        this.Motor2.set(speed);
    }
    public void Set_Both(int speed1, int speed2) {
        this.Motor1_Speed(speed1);
        this.Motor2_Speed(speed2);
    }

    //HW 2 below 

    public void stopAllMotors(){
        this.Set_Both(0, 0);
    }

}
