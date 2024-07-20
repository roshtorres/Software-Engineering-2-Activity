package _4commandPattern;

public class Customer
{

    private final Integer custno;
    private final String lastName;
    private final String firstName;
    private final String street;
    private final String city;

    public Customer (CustomerBuilder builder)
    {
        this.custno = builder.custno;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.street = builder.street;
        this.city = builder.city;

    }


    public Integer getCustno()
    {
        return custno;
    }

    public String getLastName()
    {
        return lastName;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }


    @Override
    public String toString()
    {
        return "Custno: " + custno + "\nLastName: " + lastName +
                "\nFirstName: " + firstName +
                "\nStreet: " + street +
                "\nCity: " + city;
    }


    public static class CustomerBuilder
    {
        private Integer custno;
        private String lastName;
        private String firstName;
        private String street;
        private String city;

        public CustomerBuilder custNo(final Integer custno)
        {
            this.custno = custno;
            return this;

        }

        public CustomerBuilder lastName(final String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder firstName(final String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder street(final String street)
        {
            this.street = street;
            return this;
        }

        public CustomerBuilder city(final String city)
        {
            this.city = city;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }

}
