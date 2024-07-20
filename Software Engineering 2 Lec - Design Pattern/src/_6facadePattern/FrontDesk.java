package _6facadePattern;

public class FrontDesk
{
    private Cart cart;
    private Valet valet;
    private HouseKeeping houseKeeping;

    public FrontDesk (Customer customer)
    {
        cart = new Cart(customer.getRoomNumber());
        valet = new Valet(customer.getPlateNumber());
        houseKeeping = new HouseKeeping(customer.getRoomNumber());
    }

    public void requestCarts(Integer noOfCarts)
    {
        cart.requestCarts(noOfCarts);
    }

    public void pickUpVehicle()
    {
        valet.pickUpVehicle();
    }

    public  void cleanRoom()
    {
        houseKeeping.cleanRoom();
    }

}
