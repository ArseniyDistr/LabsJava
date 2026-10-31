package org.example;

public class App
{
    public static void main(String[] args)
    {
        Game game = new Game("Шахматы", "Логика", 4.8);
        game.play();
        game.play(3);
        game.play("Мультиплеер");
        System.out.println();

        Game[] games =
                {
                new BoardGame("Монополия", "Экономика", 4.5),
                new VideoGame("Ведьмак", "RPG", 4.9)
        };

        for (Game g : games)
        {
            System.out.println(g.getClass().getSimpleName() + " -> " + g.getDifficulty());
        }
    }
}
