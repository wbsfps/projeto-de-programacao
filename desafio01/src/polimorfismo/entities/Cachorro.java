package polimorfismo.entities;

public class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Cachorro faz som!");
    }
}
