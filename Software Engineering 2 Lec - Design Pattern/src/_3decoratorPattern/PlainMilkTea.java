package _3decoratorPattern;
import _3decoratorPattern.MilkTea;

public class PlainMilkTea implements MilkTea
{

    @Override
    public String mix()
    {
        return "Consists of milk, plain tea";
    }

}
