package org.example;

public abstract class Auto
{
    protected String brand;
    protected int id;
    protected int horsepower;

    public Auto(String brand, int id, int horsepower)
    {
        this.brand = brand;
        this.id = id;
        this.horsepower = horsepower;
    }
    @Override
    public String toString()
    {
        return String.format("%-10s | id=%-3d | %4d лошадок", brand, id, horsepower);
    }
}
