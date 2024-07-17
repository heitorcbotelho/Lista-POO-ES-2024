package Ex07;

public class main {
    public static void main(String[] args) {
        cliente jonas = new cliente("Jonas", "PR", "Loanda", "Rua JJ");
        produto celular = new produto("Celular", "Aparelho", 4000);
        carrinho carrinho = new carrinho(jonas, celular);
        estoque celularEstoque = new estoque(celular, 50);
        pedido pedido01 = new pedido(carrinho, "PIX", "Aprovado");
        relatorio relatorio = new relatorio(celular, 4000, 8000);
    }
}
