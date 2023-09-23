package livroJava.banco;
public class Conta {
    private final String  numero;
    private final String  nome;
    private double saldo;

    public Conta(String numero,String nome,double inicial){
        this.numero = numero;
        this.nome = nome;
        depositar(inicial);
    }
    public Conta(String numero,String nome){
        this.numero = numero;
        this.nome = nome;
    }
    public void depositar(double deposite){
        this.saldo += deposite;
    }
    public void retirada(double withdraw){
        this.saldo -= (withdraw + 5.0);
    }
    public String toString(){
        return "Conta:"
                + numero
                + ",Dono: "
                + nome
                +",Saldo: R$: "
                + String.format("%.2f",saldo);
    }

}
