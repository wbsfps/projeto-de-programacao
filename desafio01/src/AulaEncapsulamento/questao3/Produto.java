package AulaEncapsulamento.questao3;

public class Produto {
    private String nome;
    private Double preco;

    public void aplicarDesconto(double porcentagem) {
        this.preco = (this.preco * (porcentagem/100)) - this.preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
