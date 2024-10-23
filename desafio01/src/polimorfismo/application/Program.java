package polimorfismo.application;

import polimorfismo.entities.Animal;
import polimorfismo.entities.Cachorro;
import polimorfismo.entities.Gato;
import polimorfismo.entities.Vaca;

public class Program {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal vaca = new Vaca();
        Animal gato = new Gato();

        animal.fazerSom();
        cachorro.fazerSom();
        vaca.fazerSom();
        gato.fazerSom();
    }
}
