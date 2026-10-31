package org.example;
import java.util.*;

public class Singer
{
    private int id;
    private String name;
    private String genre;
    private int popularity;
    private List<Integer> albumRatings;

    public Singer(int id, String name, String genre, int popularity, List<Integer> albumRatings)
    {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.popularity = popularity;
        this.albumRatings = new ArrayList<>(albumRatings);
    }

    public double getAverageAlbumRating()
    {
        int sum = 0;
        for (int r : albumRatings) sum += r;
        return (double) sum / albumRatings.size();
    }

    public int getPopularity() { return popularity; }
    public void setPopularity(int popularity) { this.popularity = popularity; }
    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString()
    {
        return String.format("ID =%d | %-12s | %-8s | популярность =%d | среднее =%.2f | рейтинг =%s",
                id, name, genre, popularity, getAverageAlbumRating(), albumRatings);
    }
}
