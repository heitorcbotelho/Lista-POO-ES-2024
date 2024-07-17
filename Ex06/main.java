package Ex06;

public class main {
    public static void main(String[] args) {
        usuario pedro = new usuario("Pedro", "03-10-2000", "Online");
        usuario joao = new usuario("João", "2004-08-11", "Online");
        post post = new post(pedro, null, "Atividade X", 1, null);
        comunidade programadores = new comunidade("Boate Everest", post);
        privacidade control = new privacidade(pedro, true, true);
        conexao amigo = new conexao(pedro, joao, "Manos");
    }
}
