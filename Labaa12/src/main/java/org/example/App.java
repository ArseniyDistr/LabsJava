package org.example;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Автомобили");
        System.out.println("2. Певцы");
        System.out.print("Выбор: ");
        while(true)
        {
            switch (scanner.nextInt())
            {
                case 1:
                    Map<String, Auto> autos = new LinkedHashMap<>();
                    autos.put("Toyota Camry", new Sedan("Toyota", 1, 200, 500.0));
                    autos.put("Honda Accord", new Sedan("Honda", 2, 192, 470.0));
                    autos.put("BMW 5 Series", new Sedan("BMW", 3, 250, 520.0));
                    autos.put("Land Rover", new SUV("Land Rover", 4, 300, 220));
                    autos.put("Toyota RAV4", new SUV("Toyota", 5, 180, 195));
                    autos.put("Jeep Grand", new SUV("Jeep", 6, 285, 210));
                    autos.put("Ferrari F8", new SportsCar("Ferrari", 7, 720, 340));
                    autos.put("Porsche 911", new SportsCar("Porsche", 8, 450, 330));

                    for (Map.Entry<String, Auto> e : autos.entrySet())
                    {
                        System.out.printf("%-18s ------> %s%n", e.getKey(), e.getValue());
                    }
                    break;

                case 2:
                    List<Singer> singers = new ArrayList<>();
                    singers.add(new Singer(1, "Adele", "Pop", 8, Arrays.asList(5, 4, 5, 3)));
                    singers.add(new Singer(2, "Ed Sheeran", "Pop", 9, Arrays.asList(4, 4, 5, 4)));
                    singers.add(new Singer(3, "Drake", "Rap", 7, Arrays.asList(2, 3, 2, 4)));
                    singers.add(new Singer(4, "Beyonce", "R&B", 8, Arrays.asList(5, 5, 4, 5)));
                    singers.add(new Singer(5, "Eminem", "Rap", 6, Arrays.asList(2, 1, 3, 2)));
                    singers.add(new Singer(6, "Taylor Swift", "Pop", 10, Arrays.asList(4, 5, 4, 5)));

                    singers.removeIf(s -> s.getAverageAlbumRating() < 3);
                    for (Singer s : singers)
                    {
                        if (s.getAverageAlbumRating() >= 4) s.setPopularity(s.getPopularity() + 1);
                    }
                    singers.sort(Comparator.comparingDouble(Singer::getAverageAlbumRating).reversed()
                            .thenComparing(Singer::getName));

                    for (Singer s : singers)
                    {
                        System.out.printf("ID %d | %-12s | среднее = %.2f%n", s.getId(), s.getName(), s.getAverageAlbumRating());
                    }
                    break;

                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
