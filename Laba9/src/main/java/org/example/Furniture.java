package org.example;

public abstract class Furniture
{
    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price)
    {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() { return name; }
    public String getMaterial() { return material; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setMaterial(String material) { this.material = material; }
    public void setPrice(double price) { this.price = price; }

    public abstract String getPurpose();
    public abstract String getDimensions();

    public void displayInfo()
    {
        System.out.printf("Мебель: %s, материал: %s, цена: %.2f%n",
                name, material, price);
    }
}
