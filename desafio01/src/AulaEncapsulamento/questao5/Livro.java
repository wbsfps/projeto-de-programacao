package AulaEncapsulamento.questao5;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(){}

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.printf("Título: %s | Autor: %s", getTitulo(), getAutor());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
