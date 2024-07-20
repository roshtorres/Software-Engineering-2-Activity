package decorator.decorator;

import decorator.decorator.MilkTea;
import decorator.decorator.MilkTeaDecorator;

public class WinterMelon implements MilkTeaDecorator {
    private MilkTea milkTea;

    @Override
    public String mix() {
        return  milkTea.mix() + " added with kundol flavor ";
    }

    @Override
    public void setMilkTea(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
}
