package Ex03;

public class main {
    public static void main(String[] args) {
        paciente maria = new paciente("Maria", null, null);
        leito leito132 = new leito("132", null, true, null);
        medico cleiton = new medico("Cleiton", "Oftalmologista");
        exame exame = new exame(maria, "Vista", "05-08-2024", "07:30", null);
        consulta consulta = new consulta(maria, cleiton, "2024-07-05", "07:30", "Oftalmo");
    }
}
