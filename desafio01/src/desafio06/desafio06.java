package desafio06;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String verificandoNumero = (number > 0) ? "positivo" : "negativo";
        System.out.println(verificandoNumero);

        int number02 = sc.nextInt();

        if (number > number02) {
            System.out.println("O primeiro número é maior");
        } else if (number02 > number) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }

        double areaQuadrado = Math.pow(sc.nextDouble(), 2);
        System.out.println(areaQuadrado);
        double raio = Math.pow(sc.nextDouble(), 2);
        double areaCirculo = Math.PI * raio;
        System.out.println(areaCirculo);

        System.out.println("Insira um número para fazer a tabuada: ");
        int numeroParaTabuada = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", numeroParaTabuada, i, numeroParaTabuada*i);
        }
        int numeroParOuImpar = sc.nextInt();
        String paridadeNumero = (numeroParOuImpar % 2 == 0) ? "par" : "impar";

        System.out.println(paridadeNumero);

        int numeroParaSerFatorado = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numeroParaSerFatorado; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
