package _5observerPattern;

public class Client implements ClientObserver
{
    private String clientName;

    public String getClientName()
    {
        return clientName;
    }

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    @Override
    public void update(Stock stock)
    {
        System.out.println(clientName + ", " + stock.getStockName() + " has a new stock price of " +stock.getStockPrice());
    }
}
