package polimorfismo.ex02.entities;

public class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("Dirige");
    }
}
