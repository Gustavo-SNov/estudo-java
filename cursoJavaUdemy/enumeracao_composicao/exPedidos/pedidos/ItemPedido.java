package cursoJavaUdemy.enumeracao_composicao.exPedidos.pedidos;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemPedido(Integer quantidade, Double preco, Produto produto){
        this.quantidade =  quantidade;
        this.preco = preco;
        this.produto = produto;
    }
    public Double subTotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return this.produto + ", Quantidade: "+ this.quantidade + String.format(", Subtotal: R$%.2f",this.preco);
    }
}
