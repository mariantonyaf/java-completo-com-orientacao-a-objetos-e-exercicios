package secao12;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro() {
        this.titulo = "Título teste";
        this.autor = "Autor";
        this.preco = 16.99;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nPreco: " + preco);
    }
}
