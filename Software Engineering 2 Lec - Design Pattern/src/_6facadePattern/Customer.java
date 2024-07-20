package _6facadePattern;

public class Customer
{
    private String customerName;
    private Integer roomNumber;
    private String plateNumber;

    public Customer(String customerName, Integer roomNumber, String plateNumber)
    {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.plateNumber = plateNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public Integer getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public String getPlateNumber()
    {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

}
