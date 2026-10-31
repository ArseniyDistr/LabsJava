package org.example;

public class VideoGame extends Game
{
    public VideoGame(String name, String genre, double rating)
    {
        super(name, genre, rating);
    }

    @Override
    public String getDifficulty()
    {
        return "Сложная";
    }
}
