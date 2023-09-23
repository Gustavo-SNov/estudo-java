package cursoJavaUdemy.heranca_poliformismo.ex3;

public class Juridica extends Pessoa{
    private Integer quantFunc;
    public Juridica(String nome,Double renda,Integer quantFunc){
        super(nome,renda);
        this.quantFunc = quantFunc;
    }

    public Integer getQuantFunc() {
        return quantFunc;
    }

    public void setQuantFunc(Integer quantFunc) {
        this.quantFunc = quantFunc;
    }
    @Override
    public double imposto(){
        if(quantFunc <= 10){
            return getRenda() * 0.16;
        } else {
            return getRenda() * 0.14;
        }
    }
}
