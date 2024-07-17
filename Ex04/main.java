package Ex04;

public class main {
    public static void main(String[] args) {
        hospede pedro = new hospede ("Pedro","email2gmail.com");
        quarto quarto60 = new quarto ("60", "1", "VIP", 50, false);
        servico servicoDeQuarto = new servico ("Serviço de Quarto", 20);
        reserva reserva = new reserva ("08-09-2023", "05-10-2024", pedro, quarto60, servicoDeQuarto);
        relatorio relatorio = new relatorio (1, 100, 19);
    }
}
