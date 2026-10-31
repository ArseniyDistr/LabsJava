package org.example;

public class BoardGame extends Game
{
    public BoardGame(String name, String genre, double rating)
    {
        super(name, genre, rating);
    }

    @Override
    public String getDifficulty()
    {
        return "Легкая";
    }
}

