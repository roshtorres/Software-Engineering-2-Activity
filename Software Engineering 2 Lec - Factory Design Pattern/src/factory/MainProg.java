package factory;
import java.util.*;

public class MainProg
{
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            System.out.print("\n[1] Dog\n" +
                             "[2] Cat\n");
            System.out.print("Enter choice [1 or 2]: ");
            choice = scanner.nextInt();

            //Instatiate Factory
            PetRecord petRecord = new PetRecord();

            switch(choice)
            {
                case 1: Pet dog = new Dog();
                        setIdName(petRecord);
                        petRecord.setPet(dog);
                        //Additional Credentials
                        ((Dog) dog).setBreed("German Sheperd");
                        displayInfo(petRecord);
                        break;


                case 2: Pet cat = new Cat();
                        setIdName(petRecord);
                        petRecord.setPet(cat);
                        //Additional Credentials
                        ((Cat) cat).setLifeCounter(9);
                        ((Cat) cat).setRunSpeed(38.0);
                        displayInfo(petRecord);
                        break;


                default: System.exit(0);
            }
        }

    }

    public static void displayInfo(PetRecord petRecord)
    {
        System.out.println("Pet ID: " + petRecord.getId());
        System.out.println("Pet Name: " + petRecord.getName());
        System.out.println("Kind of Pet: " + petRecord.getPet().getClass().getSimpleName());
        System.out.println("Style of Affection: " + petRecord.getPet().showLove());
    }

    public static void setIdName(PetRecord petRecord)
    {
        Scanner petCred = new Scanner(System.in);

        String id = new String();
        String name = new String();

        System.out.print("Enter ID: ");
        id = petCred.next();

        System.out.println();

        System.out.print("Enter Pet Name: ");
        name = petCred.next();

        petRecord.setId(id);
        petRecord.setName(name);
    }
}
