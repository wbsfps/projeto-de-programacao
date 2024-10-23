package polimorfismo.application;

import polimorfismo.entities.Animal;
import polimorfismo.entities.Cachorro;
import polimorfismo.entities.Gato;
import polimorfismo.entities.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Animal());
        animais.add(new Cachorro());
        animais.add(new Vaca());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
