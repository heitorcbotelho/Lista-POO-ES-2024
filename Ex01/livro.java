package Ex01;

public class livro {
    String titulo;
    String autor;
    String genero;
    String editora;
    String categoria;
    boolean disponibilidade;

    public livro (String titulo, String autor, String genero, String editora, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.disponibilidade = disponibilidade;
    }
}
