package org.example;

public class SportsCar extends Auto
{
    private int topSpeed;

    public SportsCar(String brand, int id, int horsepower, int topSpeed)
    {
        super(brand, id, horsepower);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format(" | SportsCar: максимум %d км/ч", topSpeed);
    }
}
