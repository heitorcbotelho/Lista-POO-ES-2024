package Ex06;

public class post {
    usuario usuario;
    String arquivo;
    String texto;
    int numeroCurtida;
    String comentario;
    public post(usuario usuario, String arquivo, String texto, int numeroCurtida, String comentario){
        this.usuario = usuario;
        this.arquivo = arquivo;
        this.texto = texto;
        this.numeroCurtida = numeroCurtida;
        this.comentario = comentario;
    }

}
