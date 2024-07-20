package _6facadePattern;

public class HouseKeeping
{
    private Integer roomNumber;

    public HouseKeeping(Integer roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    public void cleanRoom()
    {
        System.out.println("Request clean room at " + roomNumber);
    }

}
