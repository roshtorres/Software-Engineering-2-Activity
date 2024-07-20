package _7builderPattern;

@NoArgsConstructor
public class CarBuilder {
    private String brand;
    private String engineType;
    private String transmission;
    private String color;
    private int passengerCapacity;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
        return this;
    }

    public Car build() {
        return new Car(brand, engineType, transmission, color, passengerCapacity);
    }
}
