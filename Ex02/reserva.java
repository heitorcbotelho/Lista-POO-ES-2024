package Ex02;

public class reserva {
    usuario usuario;
    assentos assento;
    String status; //pendente, confirmado, cancelado
    servico servico;

    public reserva (usuario usuario, assentos assento, String status, servico servico){
        this.usuario = usuario;
        this.assento = assento;
        this.status = status;
        this.servico = servico;
    }
}
