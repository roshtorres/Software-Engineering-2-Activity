package _4commandPattern;

public class PowerOff implements Command
{
    private Appliance appliance;

    public PowerOff (Appliance appliance)
    {
        this.appliance = appliance;
    }
    @Override
    public void execute()
    {
        appliance.switchOff();
    }

}
