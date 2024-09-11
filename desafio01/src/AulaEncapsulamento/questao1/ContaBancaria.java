package AulaEncapsulamento.questao1;

public class ContaBancaria {
    private String numeroConta;
    private Double saldo;
    public String titular;

    public ContaBancaria(){}

    public ContaBancaria(String numeroConta, String titular, Double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s | Saldo: $%.2f | Número conta %s", getTitular(), getSaldo(), getNumeroConta());
    }
}
