package decorator.decorator;

import decorator.decorator.MilkTea;

public class PlainMilkTea implements MilkTea {
    @Override
    public String mix() {
        return "Consists of milk, plain tea";
    }
}
