package org.example;

public class App
{
    public static void main(String[] args)
    {
        Professional[] staff = new Professional[5];

        staff[0] = new Doctor("Иванов Иван", 12, 4.8, "Кардиолог");
        staff[1] = new Doctor("Петрова Анна", 7, 4.5, "Педиатр");
        staff[2] = new Doctor("Сидоров Олег", 20, 4.9, "Хирург");
        staff[3] = new Engineer("Кузнецов Дмитрий", 9, 4.6, "АСУ ТП");
        staff[4] = new Engineer("Морозова Елена", 15, 4.7, "Проектирование мостов");

        for (Professional p : staff)
        {
            System.out.println("--- " + p.getClass().getSimpleName() + " ---");
            p.displayInfo();
            p.work();
            System.out.println();
        }

        System.out.println("=== Уникальные методы ===");
        for (Professional p : staff)
        {
            if (p instanceof Doctor) ((Doctor) p).diagnose();
            if (p instanceof Engineer) ((Engineer) p).design();
        }
    }
}
