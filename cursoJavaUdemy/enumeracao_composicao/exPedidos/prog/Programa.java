package cursoJavaUdemy.enumeracao_composicao.exPedidos.prog;


import cursoJavaUdemy.enumeracao_composicao.exPedidos.pedidos.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa");

        try {
            System.out.println("Insira os dados do cliente:");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("Data de nascimento(dd/mm/aaaa): ");
            Date data = sdf.parse(input.next());

            Cliente cliente = new Cliente(nome,email,data);

            System.out.printf("%nInsira os dados do pedido:%n");
            System.out.print("Status: ");
            StatusPedido status = StatusPedido.valueOf(input.next());

            Pedido pedido = new Pedido(new Date(), status,cliente );

            System.out.print("Quantos itens há nesse pedido? ");
            int n = input.nextInt();

            for(int i=0; i<n; i++){
                System.out.printf("%nInsira os dados do item #%d: ", i+1);

                System.out.print("Nome do produto: ");
                String nomeProduto = input.nextLine();
                System.out.print("Preço do produto: ");
                Double preco = input.nextDouble();
                Produto produto = new Produto(nomeProduto,preco);

                System.out.print("Quantidade: ");
                int quantidade = input.nextInt();

                ItemPedido item = new ItemPedido(quantidade,preco,produto);

                pedido.addItem(item);
            }
            System.out.printf("%nResumo dos pedidos:%n");
            System.out.println(pedido);

        } catch(ParseException e) {
            System.out.println("Data de nascimento inválida!");
        }

        input.close();
    }

}
