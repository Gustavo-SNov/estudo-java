package cursoJavaUdemy.arquivos.exercicio;

public class Produto {
    private String nome;
    private Double valor;
    private Integer quantidade;
    public Produto(String nome,Double valor,Integer quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double total(){
        return this.valor * this.quantidade;
    }
}
