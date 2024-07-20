package org.example;

public class CarAssemble
{
    public static void main(String[] args)
    {
        // testing its toString() method in getting the Car attributes.
        Car object1 = Car.builder()
                .brand("Mercedes-Benz")
                .engineType("Diesel")
                .transmission("Automatic")
                .color("Gray")
                .passengerCapacity(4)
                .build();
        System.out.println("CAR 1\n" + object1);

        System.out.println("--------------------------------------------");

        // testing its getter() methods in getting the Car attributes.
        Car object2 = Car.builder()
                .brand("Porsche")
                .engineType("Gasoline")
                .transmission("Manual")
                .color("Red")
                .passengerCapacity(2)
                .build();
        System.out.println("CAR 2");
        System.out.println("Brand: " + object2.getBrand());
        System.out.println("Engine Type: " + object2.getEngineType());
        System.out.println("Transmission: " + object2.getTransmission());
        System.out.println("Color: " + object2.getColor());
        System.out.println("Passenger Capacity: " + object2.getPassengerCapacity());

        System.out.println("--------------------------------------------");

        // testing a Car() constructor  and setting its attributes using the setter methods.
        Car object3 = new CarBuilder()
                .setBrand("Volkswagen")
                .setEngineType("Diesel")
                .setTransmission("Automatic")
                .setColor("Black")
                .setPassengerCapacity(5)
                .build();
        System.out.println("CAR 3\n" + object3.toString());
    }
}
