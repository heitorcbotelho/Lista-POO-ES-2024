package Ex01;

public class emprestimo {
    livro livro;
    usuario usuario;
    String dataEmprestimo;
    String dataDevolucao;

    public emprestimo (livro livro, usuario usuario, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}
