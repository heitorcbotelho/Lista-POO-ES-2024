package Ex08;

public class main {
    public static void main(String[] args) {
        mensalidade parcela = new mensalidade("Boleto", 99, "10-05-2024", "10-05-2025");
        treinamento costas = new treinamento("Costas", "Puxada com toalha", "Remada");
        aula aula = new aula("04-08-2024", "15:00", "16:00", costas);
        membro pedro = new membro("Membro", null, null);
        instrutor paulo = new instrutor("Paulo", costas);
    }
    
}
