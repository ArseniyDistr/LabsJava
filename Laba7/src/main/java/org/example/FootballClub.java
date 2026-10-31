package org.example;

public class FootballClub
{
    private String name;
    private String country;
    private int points;

    private static int totalClubs = 0;
    private static int totalPoints = 0;

    public FootballClub(String name, String country, int points)
    {
        this.name = name;
        this.country = country;
        this.points = points;
        totalClubs++;
        totalPoints += points;
    }

    public static void test1()
    {
        System.out.println(FootballClub.totalClubs + totalPoints);
    }
    public void test2()
    {
        System.out.println(this.name + this.country + this.points);
    }

    public static double getAvgPoints()
    {
        return (double) totalPoints / totalClubs;
    }

}
