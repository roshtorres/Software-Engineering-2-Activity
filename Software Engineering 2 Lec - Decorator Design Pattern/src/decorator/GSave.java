package decorator;

public class GSave extends decorator.SavingsAccount
{
    public GSave(decorator.SavingsAccount account)
    {
        this.setAccountNumber(account.accountNumber);
        this.setAccountName(account.accountName);
        this.setBalance(account.getBalance());
    }

    @Override
    public String showAccountType()
    {
        return "GSave";
    }

    @Override
    public double getInterestRate()
    {
        return 0.025;
    }

    @Override
    public String showBenefits()
    {
        return super.showBenefits() + ", GCash Transfer";
    }
}
