package banco;

import java.util.Locale;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Conta account;

        System.out.print("Entre com o número da conta: ");
        String numero = input.nextLine();
        System.out.print("Digite o nome do proprietário da conta: ");
        String nome = input.nextLine();
        System.out.print("Fará um depósito inicial? (S/N): ");
        char i = input.next().charAt(0);

        if (i == 's' || i == 'S' ){
            System.out.print("Digite o valor do depósito inicial: ");
            double inicial = input.nextDouble();
            account = new Conta(numero,nome,inicial);
        } else {
            account = new Conta(numero,nome);
        }

        System.out.printf("%nDados da conta:%n");
        System.out.println(account);

        System.out.print("Digite o valor do depósito: ");
        double deposito = input.nextDouble();
        account.depositar(deposito);
        System.out.println("Dados da conta atualizado:");
        System.out.println(account);


        System.out.print("Digite o valor de retirada: ");
        double retirada = input.nextDouble();
        account.retirada(retirada);
        System.out.println("Dados da conta atualizado:");
        System.out.println(account);
    }
}
