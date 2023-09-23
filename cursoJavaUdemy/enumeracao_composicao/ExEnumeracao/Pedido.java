package cursoJavaUdemy.enumeracao_composicao.ExEnumeracao;

import java.util.Date;
public class Pedido {

    private final Integer id;
    private final Date moment;
    private final StatusPedido status;

    public Pedido(Integer id, Date moment, StatusPedido status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}
