package _6facadePattern;

public class PaymentStatus
{
    private double balance;

    public PaymentStatus(double balance)
    {
        this.balance = balance;
    }

    public boolean checkPaymentStatus()
    {
        return balance <= 0;
    }

    public double getBalance()
    {
        return balance;
    }
}
