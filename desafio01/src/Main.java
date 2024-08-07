public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        System.out.println(incluidoNoPlano);

        double notaDoFilme = 8.1;
        System.out.println(notaDoFilme);

        double media = (5.5 + 6.5 + 9.5) / 3;
        System.out.println(media);

        String sinopse = """
                        Filme ruim
                        Filme mais ou menos
                        Filme do ano
                        """ + anoDeLancamento;
        System.out.println(sinopse);

    }
}
