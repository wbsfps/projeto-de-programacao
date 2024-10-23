package polimorfismo.ex03.application;

import polimorfismo.ex03.entities.Calculadora;

public class Program {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(1,2));
        System.out.println(calculadora.somar(1,2,3));
        System.out.println(calculadora.somar(1.2,2.5));
    }
}
