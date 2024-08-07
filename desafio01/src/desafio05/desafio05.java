package desafio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<Integer> numerosEscolhidos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int secretNumber = sc.nextInt();
            count++;

            int numeroAleatorio =  new Random().nextInt(100);
            if (numeroAleatorio == secretNumber) {
                break;
            }
            numerosEscolhidos.add(numeroAleatorio);
        }

        System.out.println("Número de tentativas: " + count);
        System.out.println("Lista de números adivinhados pelo random: " + numerosEscolhidos);
    }
}
