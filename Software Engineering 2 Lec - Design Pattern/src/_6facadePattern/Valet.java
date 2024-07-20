package _6facadePattern;

public class Valet
{
    private String plateNumber;

    public Valet(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }
    public void pickUpVehicle()
    {
        this.plateNumber = plateNumber;

        System.out.println("Requesting " + plateNumber + " be available at the lobby!");
    }

}
