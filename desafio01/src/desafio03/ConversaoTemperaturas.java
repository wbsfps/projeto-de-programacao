package desafio03;

import java.util.Scanner;

public class ConversaoTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus celsius para converter para Fahrenheit: ");
        double temperaturaEmCelsius = sc.nextDouble();

        double converterParaFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.println(Math.ceil(converterParaFahrenheit));

    }
}
