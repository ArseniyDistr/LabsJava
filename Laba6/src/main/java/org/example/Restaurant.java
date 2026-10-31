package org.example;

public class Restaurant {
    private String name;
    private String cuisine;
    private int rating;
    private int kolvo;

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public Restaurant(String name, String cuisine, int rating, int kolvo) {
        this(name,cuisine,rating);
        this.kolvo = kolvo;
    }


    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public int getRating() {
        return rating;
    }

    public boolean isPopular() {
        return rating > 4;
    }

}
