package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore {
    private final List<Shoe> shoes = new ArrayList<>();

    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }

    public Shoe findShoe(String brand, int size) throws ShoeNotFoundException {
        for (Shoe s : shoes) {
            if (s.getBrand().equalsIgnoreCase(brand) && s.getSize() == size) {
                return s;
            }
        }
        throw new ShoeNotFoundException("Не найдено: " + brand + " " + size);
    }

    public List<Shoe> getAll() {
        return shoes;
    }
}