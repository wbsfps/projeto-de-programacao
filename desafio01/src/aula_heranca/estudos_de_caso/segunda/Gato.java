package aula_heranca.estudos_de_caso.segunda;

public class Gato extends Animal{
    @Override
    public void emimirSom(String som) {
        super.emimirSom(som);
    }
    public void arranharMoveis() {
        System.out.println("Arranhando moveis");
    }
}
