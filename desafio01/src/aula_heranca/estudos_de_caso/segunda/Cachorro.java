package aula_heranca.estudos_de_caso.segunda;

public class Cachorro extends Animal{
    @Override
    public void emimirSom(String som) {
        super.emimirSom(som);
    }
    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }
}
