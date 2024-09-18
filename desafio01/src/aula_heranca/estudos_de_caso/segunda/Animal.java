package aula_heranca.estudos_de_caso.segunda;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emimirSom(String som) {
        System.out.println(som);
    }
}
