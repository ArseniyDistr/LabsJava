package org.example;

public class Sedan extends Auto
{
    private double trunkVolume;

    public Sedan(String brand, int id, int horsepower, double trunkVolume)
    {
        super(brand, id, horsepower);
        this.trunkVolume = trunkVolume;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format(" | Sedan: багажник %.1f л", trunkVolume);
    }
}
