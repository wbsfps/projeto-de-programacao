package AulaEncapsulamento.questao2;

public class IdadePessoa {
    private String nome;
    private Integer idade;

    public IdadePessoa(){}

    public IdadePessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String verificarIdade(Integer idade) {
        return (idade > 18) ? "Maior de idade" : "Menor de idade";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
