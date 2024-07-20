package _2factoryPattern;

public class Cat implements Pet
{
    private double runSpeed;
    private int lifeCounter;

    public double getRunSpeed()
    {
        return runSpeed;
    }
    public void setRunSpeed(Double runSpeed)
    {
        this.runSpeed = runSpeed;
    }

    public int getLifeCounter()
    {
        return lifeCounter;
    }
    public void setLifeCounter(Integer lifeCounter)
    {
        this.lifeCounter = lifeCounter;
    }

    @Override
    public String showLove()
    {
        return "Keeps purring!";
    }

}
