package _3decoratorPattern;
import _3decoratorPattern.MilkTea;
import _3decoratorPattern.MilkTeaDecorator;

public class Pearl implements MilkTeaDecorator
{
    private MilkTea milkTea;

    @Override
    public String mix()
    {
        return milkTea.mix() +" added with pearls";
    }

    public MilkTea getMilkTea()
    {
        return milkTea;
    }
    @Override
    public void setMilkTea(MilkTea milkTea)
    {
        this.milkTea = milkTea;
    }

}
