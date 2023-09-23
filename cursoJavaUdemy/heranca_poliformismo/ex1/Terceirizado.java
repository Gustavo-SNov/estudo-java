package cursoJavaUdemy.heranca_poliformismo.ex1;

public class Terceirizado extends Funcionario {
    private Double adicional;

    public Terceirizado(String nome,Integer hora,Double valorHora, Double adicional){
        super(nome,hora,valorHora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    @Override
    public double pagamento(){
        return super.pagamento() + adicional*1.1;
    }
}
