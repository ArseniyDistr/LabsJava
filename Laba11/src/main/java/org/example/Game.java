package org.example;

public class Game
{
    private String name;
    private String genre;
    private double rating;

    public Game(String name, String genre, double rating)
    {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }
    public void play()
    {
        System.out.println("Играю");
    }
    public void play(int level)
    {
        System.out.println("Играю на уровне " + level);
    }
    public void play(String mode)
    {
        System.out.println("Играю в режиме " + mode);
    }
    public String getDifficulty()
    {
        return "Средняя";
    }
}
