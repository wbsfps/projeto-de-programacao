package desafio03;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber;
        double secondNumber;

        System.out.println("Enter a number: ");
        firstNumber = sc.nextDouble();
        System.out.println("Enter another number: ");
        secondNumber = sc.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println(sum);
    }
}
