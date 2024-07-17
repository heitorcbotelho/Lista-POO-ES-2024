package Ex03;

public class consulta {
    paciente paciente;
    medico medico;
    String data;
    String hora;
    String tipo; //geral, oftalmo, etc

    public consulta (paciente paciente, medico medico, String data, String hora, String tipo){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
    }
}
