package externals.alura.entities;

public class Carro {
    Double velocidade;
    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0.0;
    }

    public void acelerar() {
        this.velocidade += 20;
    }

    public void frear() {
        this.velocidade -= 10;
    }

    public void acenderFarol() {
        System.out.println("Farol ligado!");
    }
}
