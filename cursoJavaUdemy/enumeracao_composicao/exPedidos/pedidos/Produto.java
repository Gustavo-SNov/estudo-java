package cursoJavaUdemy.enumeracao_composicao.exPedidos.pedidos;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome,Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return this.nome + String.format(", R$: %.2f",this.preco);
    }

}
