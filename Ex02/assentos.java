package Ex02;

public class assentos {
    String numeroAssento;
    boolean disponivel;
    String tipoAssento;
    voo voo;

    public assentos (String numeroAssento, boolean disponivel, String tipoAssento, voo voo){
        this.numeroAssento = numeroAssento;
        this.disponivel = disponivel;
        this.tipoAssento = tipoAssento;
        this.voo = voo;
    }
}
