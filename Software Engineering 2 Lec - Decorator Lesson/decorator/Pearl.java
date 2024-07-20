package decorator.decorator;

import decorator.decorator.MilkTea;
import decorator.decorator.MilkTeaDecorator;

public class Pearl implements MilkTeaDecorator {
    private MilkTea milkTea;
    @Override
    public String mix() {
        return milkTea.mix() +" added with pearls";
    }

    public MilkTea getMilkTea() {
        return milkTea;
    }

    @Override
    public void setMilkTea(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
}
