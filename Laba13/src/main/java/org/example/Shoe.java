package org.example;

public class Shoe {
    private String brand;
    private int size;
    private String color;
    private double price;
    private int stock;

    public Shoe(String brand, int size, String color, double price, int stock) {
        if (brand == null || brand.isEmpty()) throw new InvalidShoeDataException("Пустой бренд");
        if (size < 20 || size > 50) throw new InvalidShoeDataException("Размер вне 20-50: " + size);
        if (price <= 0) throw new InvalidShoeDataException("Цена <= 0: " + price);
        if (stock < 0) throw new InvalidShoeDataException("Количество < 0: " + stock);
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int quantity) throws StockException {
        if (quantity <= 0) throw new InvalidShoeDataException("Количество <= 0: " + quantity);
        if (quantity > stock) throw new StockException("Недостаточно товара", quantity, stock);
        stock -= quantity;
        System.out.println("Продано " + quantity + ", остаток: " + stock);
    }

    public void restock(int quantity) {
        if (quantity <= 0) throw new InvalidShoeDataException("Количество <= 0: " + quantity);
        stock += quantity;
        System.out.println("Пополнено на " + quantity + ", остаток: " + stock);
    }

    public String getBrand() { return brand; }
    public int getSize() { return size; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return brand + " " + size + " (" + color + "), " + price + " руб., склад: " + stock;
    }
}
