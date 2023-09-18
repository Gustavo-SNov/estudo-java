package vetores_Listas.exFuncionarios;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id,String nome,Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentoSalario(double porcentagem){
        this.salario *= (1.0 +(porcentagem/100));
    }
    public Integer getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return this.id+", "+this.nome+", "+ String.format("%.2f",this.salario);
    }
}
