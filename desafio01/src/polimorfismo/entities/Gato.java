package polimorfismo.entities;

public class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Gato faz som!");
    }
}
