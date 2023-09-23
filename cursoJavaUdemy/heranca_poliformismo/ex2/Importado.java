package cursoJavaUdemy.heranca_poliformismo.ex2;

public class Importado extends Produto{
    private Double taxa;
    public Importado(String nome,Double preco, Double taxa){
        super(nome,preco);
        this.taxa = taxa;
    }
    public Double total(){
        return getPreco() + this.taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String priceTag(){
        return  getNome() + String.format(" R$ %.2f", total()) + String.format(" (Taxa de importação: %.2f)", taxa );
    }
}
