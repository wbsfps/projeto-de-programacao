package aula_heranca.estudos_de_caso.primeira;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carro {
    private String modelo;
    protected double preco;
    private double somaPreco;
    private double quantidadeDePreco;
    private double precoMedio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public double calculaMedia () {
        somaPreco += preco;
        quantidadeDePreco++;
        return somaPreco / quantidadeDePreco;
    }
}
