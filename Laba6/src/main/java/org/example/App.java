package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Restaurant r = new Restaurant("Токио", "Японская", 5);
        System.out.println("Ресторан: " + r.getName());
        System.out.println("Кухня: " + r.getCuisine());
        System.out.println("Рейтинг: " + r.getRating());
        System.out.println("Популярный: " + r.isPopular());

        Restaurant r2 = new Restaurant("Токио", "Японская", 5,1);
        System.out.println("Ресторан: " + r2.getName());
        System.out.println("Кухня: " + r2.getCuisine());
        System.out.println("Рейтинг: " + r2.getRating());
        System.out.println("Популярный: " + r2.isPopular());
        System.out.println("Количество: " + r2.getKolvo());
    }
}
