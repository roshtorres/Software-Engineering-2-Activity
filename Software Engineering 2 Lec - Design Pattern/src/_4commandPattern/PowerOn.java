package _4commandPattern;

public class PowerOn implements Command
{
    private Appliance appliance;

    public PowerOn(Appliance appliance){
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.switchOn();
    }

}
