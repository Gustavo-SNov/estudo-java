package cursoJavaUdemy.heranca_poliformismo.ex3;

public class Fisica extends Pessoa{
    private Double saude;
    public Fisica(String nome,Double renda, Double saude){
        super(nome,renda);
        this.saude = saude;
    }

    public Double getSaude() {
        return saude;
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }
    @Override
    public double imposto(){
        if(getRenda() < 20000.00) {
            return (getRenda()*0.15) - (saude * 0.5);
        } else {
            return (getRenda()*0.25) - (saude * 0.5);
        }
    }
}
