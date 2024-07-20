package _5observerPattern;

public class PSE
{
    public static void main(String[] args)
    {

        Stock jollibee = new Stock();
        jollibee.setStockName("Jollibee");

        //client list of Jolliebee
        Client jose = new Client();
        jose.setClientName("Jose");

        Client maria = new Client();
        maria.setClientName("Maria");

        Client peter = new Client();
        peter.setClientName("Peter");

        //attach clients to the client list
        jollibee.attach(jose);
        jollibee.attach(maria);
        jollibee.attach(peter);

        //notify clients every time there is a change of stock price.
        jollibee.setStockPrice(226.20);

        // new stock price has emerged
        System.out.println();
        jollibee.setStockPrice(225.0);

        // maria sells jollibee; wants out!
        jollibee.detach(maria);

        // a new round of changes for jollibee
        System.out.println();
        jollibee.setStockPrice(219.50);

    }

}
