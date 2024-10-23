package polimorfismo.ex02.entities;

public class Bicicleta implements Veiculo {
    @Override
    public void mover() {
        System.out.println("Pedala");
    }
}
