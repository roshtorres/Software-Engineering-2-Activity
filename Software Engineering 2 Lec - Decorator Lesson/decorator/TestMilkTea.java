package decorator.decorator;

public class TestMilkTea {
    public static void main(String[] args){

        MilkTea milkTea = new PlainMilkTea();
        WinterMelon wt = new WinterMelon();
        wt.setMilkTea(milkTea);

        System.out.println(  wt.getClass().getSimpleName()  + ": " + wt.mix());

        //added with Pearls
        Pearl addedPearl = new Pearl();
        addedPearl.setMilkTea(wt);

        System.out.println( addedPearl.getMilkTea().getClass().getSimpleName()
                + " "+ addedPearl.mix());
    }
}
