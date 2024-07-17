package Ex03;

public class exame {
    paciente paciente;
    String tipo; 
    String data;
    String hora;
    String resultado;

    public exame (paciente paciente, String tipo, String data, String hora, String resultado){
        this.paciente = paciente;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.resultado = resultado;
    }
}
