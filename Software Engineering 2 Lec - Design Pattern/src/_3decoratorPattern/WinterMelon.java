package _3decoratorPattern;

public class WinterMelon implements MilkTeaDecorator
{
    private MilkTea milkTea;

    @Override
    public String mix()
    {
        return  milkTea.mix() + " added with kundol flavor ";
    }

    @Override
    public void setMilkTea(MilkTea milkTea)
    {
        this.milkTea = milkTea;
    }

}
