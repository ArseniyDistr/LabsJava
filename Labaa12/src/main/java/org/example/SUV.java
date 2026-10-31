package org.example;

public class SUV extends Auto
{
    private int groundClearance;

    public SUV(String brand, int id, int horsepower, int groundClearance)
    {
        super(brand, id, horsepower);
        this.groundClearance = groundClearance;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format(" | SUV: клиренс %d мм", groundClearance);
    }
}
