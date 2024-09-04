package SIstemaContaBancaria.main;

import SIstemaContaBancaria.entities.ContaBancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ContaBancaria> contaBancariaList = new ArrayList<>();

        System.out.println("Quantos clientes deseja cadastrar? ");
        int quantidadeClientes = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quantidadeClientes; i++) {
            System.out.println("Informe o número da conta e saldo do cliente: " + i);
            String numeroConta = sc.nextLine();
            double saldo = sc.nextDouble();

            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, saldo);
            contaBancariaList.add(contaBancaria);

            sc.nextLine();  // Limpa o buffer
        }

        ContaBancaria.mostrarClientes(contaBancariaList);

        System.out.println("Informe o valor do saque: ");
        double valorSaque = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o número da conta: ");
        String numeroConta = sc.nextLine();

        Optional<ContaBancaria> conta = contaBancariaList.stream()
                .filter(c -> c.getNumeroConta().equals(numeroConta))
                .findFirst();

        if (conta.isPresent()) {
            boolean sucesso = conta.get().sacar(valorSaque);
            if (!sucesso) {
                System.out.println("Saldo insuficiente para o saque.");
            } else {
                System.out.println("Saque realizado com sucesso!");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }

        ContaBancaria.mostrarClientes(contaBancariaList);
    }
}
