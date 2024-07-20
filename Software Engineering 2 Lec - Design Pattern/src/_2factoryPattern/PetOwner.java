package _2factoryPattern;

public class PetOwner
{
    private String id;
    private String name;
    private Pet pet;
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Pet getPet()
    {
        return pet;
    }
    public void setPet(Pet pet)
    {
        this.pet = pet;
    }
    public void setPet(String typeOfPet)
    {
        if(typeOfPet.equals("dog"))
        {
            Dog dog = new Dog();
            dog.setPetName("Sansa");
            dog.setBreed("Beagle");
            this.pet = dog;
        }
        else if(typeOfPet.equals("cat"))
        {
            Cat cat = new Cat();
            cat.setPetName("Fluffy");
            cat.setRunSpeed(48.0);
            cat.setLifeCounter(9);
            this.pet = cat;
        }
    }
}
