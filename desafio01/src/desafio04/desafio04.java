package desafio04;

import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota01 = sc.nextDouble();
        double nota02 = sc.nextDouble();
        double media = (nota01 + nota02) / 2;
        System.out.println(media);

        int nota03 = (int) nota01;
        System.out.println(nota03);

        char caractere = 'M';
        System.out.println(caractere);

        String rest = "rest";

        System.out.println(caractere+rest);

        double precoProduto = sc.nextDouble();
        int quantidade = sc.nextInt();
        double valorTotal = precoProduto * quantidade;
        System.out.println("Total de " + valorTotal);

        double valorEmDolares = sc.nextDouble();
        double valorEmReal = valorEmDolares * 4.94;
        System.out.println(valorEmReal);

        double precoOriginal = sc.nextDouble();
        double percentualDesconto = sc.nextDouble();
        double novoPreco = precoOriginal - (precoOriginal * (percentualDesconto / 100));
        System.out.println(novoPreco);


    }
}
