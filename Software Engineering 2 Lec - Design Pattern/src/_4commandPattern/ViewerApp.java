package _4commandPattern;

public class ViewerApp
{
    public static void main(String[] args)
    {

        Appliance tv = new TV();
        Appliance aircon = new Aircon();

        Command powerOnTv = new PowerOn(tv);
        Command powerOffTv = new PowerOff(tv);

        Command powerOnAircon = new PowerOn(aircon);
        Command powerOffAircon = new PowerOff(aircon);

        //default command
        System.out.println("This is the default status");
        RemoteControl rm = new RemoteControl(powerOffTv);

        // put the command to  RemoteControl - powerOn
        System.out.println();
        System.out.println("Power on button is  set");
        rm.setCommand(powerOnTv);

        //put the command to RemoteControl - powerOff
        System.out.println();
        System.out.println("Power off button is  set");
        rm.setCommand(powerOffTv);

        //default command

        System.out.println("\nThis is the default status");
        rm = new RemoteControl(powerOffAircon);

        // put the command to  RemoteControl - powerOn
        System.out.println();
        System.out.println("Power on button is  set");
        rm.setCommand(powerOnAircon);

        //put the command to RemoteControl - powerOff
        System.out.println();
        System.out.println("Power off button is  set");
        rm.setCommand(powerOffAircon);
    }

}
