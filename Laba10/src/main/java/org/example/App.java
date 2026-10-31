package org.example;

public class App
{
    public static void main(String[] args)
    {
        Workable[] workers =
                {
                new Doctor("Иванов Иван", 12, "Кардиолог", 5),
                new Doctor("Петрова Анна", 7, "Педиатр", 3),
                new Doctor("Сидоров Олег", 20, "Хирург", 8),
                new Teacher("Кузнецов Дмитрий", 9, "Математика", 25),
                new Teacher("Морозова Елена", 15, "Физика", 30)
        };

        for (Workable w : workers)
        {
            w.work();
            System.out.println("Стаж: " + w.getExperience() + " лет");
        }

        System.out.println();
        for (Workable w : workers)
        {
            if (w instanceof Teachable)
            {
                Teachable t = (Teachable) w;
                t.teach();
                System.out.println("Учеников: " + t.getStudents());
            }
        }
    }
}
