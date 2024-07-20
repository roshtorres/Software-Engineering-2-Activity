package _6facadePattern;

public class Cart
{
    private Integer noOfCarts;
    private Integer roomNumber;

    public Cart(Integer roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void requestCarts(Integer noOfCarts)
    {
        this.noOfCarts = noOfCarts;

        System.out.println("Requesting " + noOfCarts + " carts " +
                " at  room Number" + roomNumber);
    }

}
