package _2factoryPattern;
import java.util.*;

public class MainProg
{
    public static void main(String[] args)
    {
        PetOwner petOwner = new PetOwner();
        petOwner.setId("123");
        petOwner.setId("Juan");
        petOwner.setPet("cat");

        Pet pet = petOwner.getPet();
        switch(pet.getClass().getSimpleName())
        {
            case "Dog": Dog dog = (Dog) pet;
                System.out.println("Pet Name: " + dog.getPetName());
                System.out.println("Breed: " + dog.getBreed());
                break;
            case "Cat": Cat cat = (Cat) pet;
                System.out.println("Pet Name: " + cat.getPetName());
                System.out.println("Run speed: " + cat.getRunSpeed() + " km/h");
                System.out.println("Life counter: " + cat.getLifeCounter());
                break;
            default:    System.out.println("Unknown pet type");
        }

        System.out.println(petOwner.getPet().showLove());
    }
}
