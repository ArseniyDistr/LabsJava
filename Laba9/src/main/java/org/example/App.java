package org.example;

public class App
{
    public static void main(String[] args)
    {
        Furniture[] items =
                {
                new Table("Обеденный стол", "Дуб", 15000.0, 4),
                new Table("Письменный стол", "ЛДСП", 8000.0, 4),
                new Table("Журнальный стол", "Стекло", 5500.0, 3),
                new Chair("Офисный стул", "Металл/ткань", 4200.0, true),
                new Chair("Барный стул", "Дерево", 3000.0, false)
        };

        for (Furniture f : items)
        {
            System.out.println("--- " + f.getClass().getSimpleName() + " ---");
            f.displayInfo();
            System.out.println("Назначение: " + f.getPurpose());
            System.out.println("Размеры: " + f.getDimensions());
            System.out.println();
        }
    }
}
