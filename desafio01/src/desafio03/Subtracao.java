package desafio03;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber;
        double secondNumber;

        System.out.println("Enter a number: ");
        firstNumber = sc.nextDouble();
        System.out.println("Enter another number: ");
        secondNumber = sc.nextDouble();

        double sub = firstNumber - secondNumber;

        System.out.println(sub);
    }
}
