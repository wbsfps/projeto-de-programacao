package aula_heranca.estudos_de_caso.quarto;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}
