package aula_heranca.estudos_de_caso.quarto;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
