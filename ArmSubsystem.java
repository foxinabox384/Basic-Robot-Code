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
    public void Motor1_Speed() {
        this.Motor1.set(0);
    }
    public void Motor2_Speed() {
        this.Motor2.set(2);
    }
    public void Set_Both() {
        this.Motor1_Speed();
        this.Motor2_Speed();
    }
}
