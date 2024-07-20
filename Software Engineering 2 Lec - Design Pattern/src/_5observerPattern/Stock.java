package _5observerPattern;
import java.util.ArrayList;
import java.util.List;

public class Stock  implements StockSubject
{
    private String stockName;
    private Double stockPrice;
    private List<Client> clientList = new ArrayList<>();

    public String getStockName()
    {
        return stockName;
    }

    public void setStockName(String stockName)
    {
        this.stockName = stockName;
    }

    public Double getStockPrice()
    {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice)
    {
        this.stockPrice = stockPrice;
        notifyClient();
    }

    public List<Client> getClientList()
    {
        return clientList;
    }

    public void setClientList(List<Client> clientList)
    {
        this.clientList = clientList;
    }

    @Override
    public void attach(Client c)
    {
        clientList.add(c);
    }

    @Override
    public void detach(Client c)
    {
        clientList.remove(c);
        System.out.println(c.getClientName() + " is removed from the list of " + stockName);
    }

    @Override
    public void notifyClient()
    {
        for(Client client : clientList){
            client.update(this);
        }
    }

}
