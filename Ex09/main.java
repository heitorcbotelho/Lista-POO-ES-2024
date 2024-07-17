package Ex09;

public class main {
    public static void main(String[] args) {
        reserva reserva = new reserva("Acomadacao", 150, "11-08-2024");
        acomodacao acomodacao = new acomodacao(reserva, 1, "Quarto Pequeno Solteiro");
        estadia estadia = new estadia("15-07-2024", "26-07-2024", "16-07-2024");
        servico servico = new servico("Limpeza de Quarto", 50);
        turista gustavo = new turista("Gustavo", "Terraqueo", "Humano", estadia, null, reserva);
        laudo laudo = new laudo(gustavo, 37, 60, 190);
        ponto ponto = new ponto("IFPR", "Brasil", "Paraná", "Paranavaí", "Instituto Federal");
        passeio passeio = new passeio(null, "19:20", ponto);
    }
}
