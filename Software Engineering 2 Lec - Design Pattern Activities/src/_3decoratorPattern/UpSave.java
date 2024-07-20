package _3decoratorPattern;

public class UpSave extends _3decoratorPattern.SavingsAccount
{
    public UpSave(_3decoratorPattern.SavingsAccount account)
    {
        this.setAccountNumber(account.accountNumber);
        this.setAccountName(account.accountName);
        this.setBalance(account.getBalance());
    }

    @Override
    public String showAccountType()
    {
        return "UpSave";
    }

    @Override
    public double getInterestRate()
    {
        return 0.04;
    }

    @Override
    public String showBenefits()
    {
        return super.showBenefits() + ", With Insurance";
    }

}
