package SIstemaContaBancaria.entities;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private List<ContaBancaria> contasBancarias = new ArrayList<>();

    public ContaBancaria() {}

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void criarConta(ContaBancaria conta) {
        contasBancarias.add(conta);
    }

    public static void mostrarClientes(List<ContaBancaria> contasBancarias) {
        for (ContaBancaria conta : contasBancarias) {
            System.out.println(conta);
        }
    }

    @Override
    public String toString() {
        return String.format("Número conta: %s / Saldo: $%.2f", getNumeroConta(), getSaldo());
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
