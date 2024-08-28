package InventarioFrutas.entities;

public class Fruit {
    private String name;

    public Fruit(){}

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
