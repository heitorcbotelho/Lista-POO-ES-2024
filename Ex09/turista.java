package Ex09;

public class turista {
    String nome;
    String origem;
    String especie;
    estadia estadia;
    servico servico;
    reserva reserva;
    public turista(String nome, String origem, String especie, estadia estadia, servico servico, reserva reserva){
        this.nome = nome;
        this.origem = origem;
        this.especie = especie;
        this.estadia = estadia;
        this.servico = servico;
        this.reserva = reserva;
    }
}
