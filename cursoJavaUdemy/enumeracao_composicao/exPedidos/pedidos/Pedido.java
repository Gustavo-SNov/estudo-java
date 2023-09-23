package cursoJavaUdemy.enumeracao_composicao.exPedidos.pedidos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static final SimpleDateFormat sdf = new SimpleDateFormat();
    private Date moment;
    private StatusPedido status;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Date moment,StatusPedido status,Cliente cliente){
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }
    public void addItem(ItemPedido item){ itens.add(item); }
    public void removeItem(ItemPedido item){ itens.remove(item); }
    public Double total(){
        Double tot = 0.0;
        for( ItemPedido item : itens){
            tot += item.subTotal();
        }
        return tot;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append( "Momento do pedido: ");
        sb.append(sdf.format(moment) + "%n");
        sb.append("Status do pedido: ");
        sb.append(status + "%n");
        sb.append("Cliente: ");
        sb.append(cliente + "%n");
        sb.append("Itens do pedido: %n");
        for (ItemPedido item : itens) {
            sb.append(item + "%n");
        }
        sb.append("Preço Total: R$ ");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
