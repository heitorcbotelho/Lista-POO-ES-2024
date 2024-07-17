package Ex01;
public class main {
    public static void main(String[] args) {
        usuario heitor = new usuario("Heitor", "Aluno", "email@gmail.com");
        livro mitologiaNordica = new livro("Mitologia Nórdica", "Neil Gaiman", "fantasia", "editora", false);
        emprestimo emprestimo = new emprestimo(mitologiaNordica, heitor, "05-03-2024", "10-06-2024");
        reserva reserva = new reserva(heitor, "05-03-2024", mitologiaNordica);
        relatorio relatorio = new relatorio(mitologiaNordica, mitologiaNordica);
    }
}