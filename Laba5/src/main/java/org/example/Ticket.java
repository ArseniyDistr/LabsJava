package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private int price;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ticket() {
    }

    public Ticket(String event, int seatNumber, int price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void applyDiscount(int discount) {
        this.price -= (this.price * discount) / 100;
    }
}
