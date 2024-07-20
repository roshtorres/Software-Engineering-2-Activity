package _2factoryPattern;

public class Dog implements Pet
{
    private String petName;
    private String breed;

    public String getBreed()
    {
        return breed;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    @Override
    public String showLove()
    {
        return "Flash puppy eyes!";
    }

}
