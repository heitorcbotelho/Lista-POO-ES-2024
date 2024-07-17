package Ex05;

public class main {
    public static void main(String[] args) {
        cliente gabriel = new cliente("Gabriel", "email@gmail.com", "123.456.789-11");
        advogado marcio = new advogado("Marcio", "marcio@pvp.com", "40028922", "10");
        compromisso compromisso = new compromisso(marcio, "13-12-2023", "5");
        documento documento = new documento("CNH", gabriel, compromisso);
        processo processo = new processo(gabriel, null, null);
    }
}
