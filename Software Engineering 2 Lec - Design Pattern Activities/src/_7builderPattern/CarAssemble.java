package _7builderPattern;

public class CarAssemble {
    public static void main(String[] args)
    {
        // Test object1: using toString() method
        Car car1 = Car.builder()
                .brand("Toyota")
                .engineType("Gasoline")
                .transmission("Automatic")
                .color("Red")
                .passengerCapacity(4)
                .build();
        System.out.println("Object1: " + car1);

        // Test object2: using getter methods
        Car car2 = Car.builder()
                .brand("Ford")
                .engineType("Diesel")
                .transmission("Manual")
                .color("Blue")
                .passengerCapacity(5)
                .build();
        System.out.println("Object2:");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Engine Type: " + car2.getEngineType());
        System.out.println("Transmission: " + car2.getTransmission());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Passenger Capacity: " + car2.getPassengerCapacity());

        // Test object3: using constructor and setter methods
        Car car3 = new CarBuilder()
                .setBrand("Honda")
                .setEngineType("Gasoline")
                .setTransmission("Manual")
                .setColor("Black")
                .setPassengerCapacity(6)
                .build();
        System.out.println("Object3: " + car3.toString());
    }
}
