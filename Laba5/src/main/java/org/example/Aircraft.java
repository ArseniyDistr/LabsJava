package org.example;

public class Aircraft {
    private String model;
    private int capacity;
    private int range;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Aircraft(String model, int capacity, int range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;
    }
}
