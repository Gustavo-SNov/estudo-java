package cursoJavaUdemy.enumeracao_composicao.ExEnumeracao;

import java.util.Date;
public class Programa {
    public static void main(String[] args) {

        Pedido order = new Pedido(1080, new Date(), StatusPedido.PENDENTE);

        System.out.println(order);

        // Conversão de String para enum
        StatusPedido os1 = StatusPedido.ENTREGUE;                       // 1° Método

        StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");      // 2° Método

        System.out.println(os1);
        System.out.println(os2);
    }
}
