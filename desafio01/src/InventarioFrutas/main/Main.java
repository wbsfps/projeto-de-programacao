package InventarioFrutas.main;

import InventarioFrutas.entities.Fruit;
import InventarioFrutas.entities.Inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantas frutas você quer adicionar: ");
        var quantityFruits = sc.nextInt();
        sc.nextLine();

        Inventory inventory = new Inventory();
        Fruit fruit;
        for (int i = 0; i < quantityFruits; i++) {
            System.out.println("Informe nome da fruta: ");
            var fruitName = sc.nextLine();


            fruit = new Fruit(fruitName);
            inventory.addFruit(fruit);
        }

        System.out.println(inventory);
    }
}
