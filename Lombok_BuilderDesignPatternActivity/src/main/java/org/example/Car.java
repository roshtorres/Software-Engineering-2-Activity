package org.example;
import lombok.*;

@Getter
@ToString
@Builder
@AllArgsConstructor
public class Car
{
    private String brand;
    private String engineType;
    private String transmission;
    private String color;
    private int passengerCapacity;
}
