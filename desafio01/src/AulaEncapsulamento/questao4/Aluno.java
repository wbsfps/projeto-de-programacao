package AulaEncapsulamento.questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private Scanner sc = new Scanner(System.in);
    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Double calcularMedia(List<Double> notas) {

        System.out.println("Informe a quantidade de notas: ");
        int quantidadeNotas = sc.nextInt();
        sc.nextLine();

        double soma = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.println("Informe a nota " + i);
            var nota = sc.nextDouble();
            notas.add(nota);

            sc.nextLine();
        }

        for (Double nota : notas) soma += nota;

        return soma / quantidadeNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
