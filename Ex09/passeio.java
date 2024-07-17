package Ex09;

public class passeio {
    reserva reserva;
    String hora;
    ponto pontoTuristico;
    public passeio(reserva reserva, String hora, ponto pontoTuristico){
        this.reserva = reserva;
        this.hora = hora;
        this.pontoTuristico = pontoTuristico;
    }
}
