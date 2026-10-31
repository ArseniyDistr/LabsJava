package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        ShoeStore store = new ShoeStore();
        try {
            store.addShoe(new Shoe("Nike", 42, "Black", 120.5, 10));
            store.addShoe(new Shoe("Adidas", 38, "White", 95.0, 5));
            store.addShoe(new Shoe("Puma", 45, "Blue", 80.0, 0));
        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }
        try {
            new Shoe("Reebok", 10, "Red", 70, 3);
        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            store.findShoe("Nike", 42).sell(3);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try
        {
            store.findShoe("Adidas", 38).sell(100);
        } catch (StockException e)
        {
            System.out.println("Ошибка склада: " + e.getMessage()
                    + " (запрошено " + e.getRequested()
                    + ", доступно " + e.getAvailable() + ")");
        } catch (ShoeNotFoundException e)
        {
            System.out.println("Не найдено: " + e.getMessage());
        }
        try
        {
            Shoe puma = store.findShoe("Puma", 45);
            puma.restock(7);
            puma.sell(5);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            store.findShoe("Nike", 99);
        } catch (ShoeNotFoundException e) {
            System.out.println("Не найдено: " + e.getMessage());
        }
        System.out.println("\nИтоговое состояние склада:");
        for (Shoe s : store.getAll()) {
            System.out.println(s);
        }
    }
}
