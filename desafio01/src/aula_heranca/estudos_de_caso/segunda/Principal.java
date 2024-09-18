package aula_heranca.estudos_de_caso.segunda;

public class Principal {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        cao.emimirSom("Au au!");
        cao.abanarRabo();
        Gato gato = new Gato();
        gato.emimirSom("Miau");
        gato.arranharMoveis();
    }
}
