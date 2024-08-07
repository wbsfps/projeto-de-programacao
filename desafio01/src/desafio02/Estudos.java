package desafio02;

import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String annotations;

        System.out.println("Anotações: ");
        annotations = sc.nextLine();

        System.out.println(annotations);
        sc.close();
    }
}
