package Ex07;

public class pedido {
    carrinho carrinho;
    String formaPagamento;
    String status; 
    public pedido(carrinho carrinho, String formaPagamento, String status){
        this.carrinho = carrinho;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }
}
