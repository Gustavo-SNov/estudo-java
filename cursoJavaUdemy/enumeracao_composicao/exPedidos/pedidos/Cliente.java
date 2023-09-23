package cursoJavaUdemy.enumeracao_composicao.exPedidos.pedidos;

import java.util.Date;
public class Cliente {
    private String nome;
    private String email;
    private Date data;

    public Cliente(String nome,String email, Date data){
        this.nome = nome;
        this.email = email;
        this.data = data;
    }
    @Override
    public String toString(){
        return "Cliente: " + this.nome +" ("+ this.data + ")  - " + this.email ;
    }

}
