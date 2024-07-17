package Ex10;

public class arvore {
    String especie;
    localizacao localizacao;
    String status;
    boolean adotada;
    public arvore(String especie, localizacao localizacao, String status, boolean adotada){
        this.especie = especie;
        this.localizacao = localizacao;
        this.status = status;
        this.adotada = adotada;
    }
}
