package _4commandPattern;

public class CustomerApp
{

    public static void main(String[] args)
    {

        // using the full composition of Customer

        Customer cust1 = new Customer.CustomerBuilder().custNo(1234)
                .lastName("Dela Cruz")
                .firstName("Juan")
                .street("356 Rizal Ave.")
                .city("Pasig City")
                .build();

        //display output
        System.out.println(cust1);

        //another variation
        System.out.println();
        Customer cust2 = new Customer.CustomerBuilder().firstName("Maria")
                .custNo(5678)
                .lastName("Santos")
                .build();

        System.out.println(cust2);
    }

}
