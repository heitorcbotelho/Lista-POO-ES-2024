package Ex02;

public class main {
    public static void main(String[] args) {
        voo voo172 = new voo("Gol","São Paulo","Belém","15-05-2024","19:00","19:30", 199);
        assentos assento24 = new assentos("24",false,"Perto da janela",voo172);
        servico animais = new servico("Levar animais",150);
        usuario jonas = new usuario("Jonas","email@gmail.com", "400289222");
        reserva reserva = new reserva(jonas,assento24,"Confirmado",animais);
    }
}
