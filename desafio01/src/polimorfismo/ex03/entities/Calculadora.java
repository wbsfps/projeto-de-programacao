package polimorfismo.ex03.entities;

public class Calculadora {

    public Integer somar(int n1, int n2) {
        return  n1 + n2;
    }

    public Integer somar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public Double somar(double n1, double n2) {
        return n1 + n2;
    }
}
