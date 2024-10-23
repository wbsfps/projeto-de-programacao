package polimorfismo.ex02.application;

import polimorfismo.ex02.entities.Bicicleta;
import polimorfismo.ex02.entities.Carro;

public class Program {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Carro carro = new Carro();

        bicicleta.mover();
        carro.mover();
    }
}
