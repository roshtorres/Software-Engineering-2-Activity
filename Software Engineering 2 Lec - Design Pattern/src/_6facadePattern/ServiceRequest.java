package _6facadePattern;

public class ServiceRequest
{
    public static void main(String[] args)
    {

        Customer customer = new Customer("Juan Dela Cruz", 1234, "ABC 5678");

        FrontDesk frontDesk = new FrontDesk(customer);
        frontDesk.cleanRoom();
        frontDesk.requestCarts(2);
        frontDesk.pickUpVehicle();
    }

}
