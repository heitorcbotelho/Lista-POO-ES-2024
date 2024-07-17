package Ex04;

public class reserva {
    String dataCheckin;
    String dataCheckout;
    hospede hospede;
    quarto quarto;
    servico servico;
    public reserva (String dataCheckin, String dataCheckout, hospede hospede, quarto quarto, servico servico){
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.hospede = hospede;
        this.quarto = quarto;
        this.servico = servico;
    }
}
