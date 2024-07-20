package _5observerPattern;

public interface StockSubject
{
    public void attach(Client c);
    public void detach(Client c);
    public void notifyClient();
}
