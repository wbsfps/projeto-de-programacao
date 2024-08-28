package InventarioFrutas.entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Fruit> fruits = new ArrayList<>();

    public Inventory(){}

    public Inventory(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    @Override
    public String toString() {
        return String.format("Inventário: %s", fruits);
    }
}
