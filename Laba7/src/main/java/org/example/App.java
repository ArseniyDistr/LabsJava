package org.example;

public class App
{
    public static void main(String[] args)
    {
        FootballClub fc1 = new FootballClub("реал мадрид", "испания", 67);
        FootballClub fc2 = new FootballClub("псж", "франция", 69);
        FootballClub fc3 = new FootballClub("ювентус", "италия", 30);
        FootballClub fc4 = new FootballClub("манчестер юн", "англия", 89);

        System.out.println("среднее кол-во очков: " + FootballClub.getAvgPoints());
    }
}
