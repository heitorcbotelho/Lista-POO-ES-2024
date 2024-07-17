package Ex10;

public class main {
    public static void main(String[] args) {
        localizacao minhaCidade = new localizacao("PA", "Belém");
        arvore carvalho = new arvore("Carvalo", minhaCidade, "Saudavel", true);
        usuario fernando = new usuario("Fernando", carvalho, "fernandin@hotmail.com", minhaCidade);
        atualizacao att1 = new atualizacao("Saudavel", "/fotos/foto.png", "Dia do cuidado da arvore");
        manutencao reg1 = new manutencao("15-02-2024", "16-02-2024", "18-02-2024");
    }
}
