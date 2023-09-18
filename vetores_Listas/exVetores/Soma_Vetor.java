package vetores_Listas.exVetores;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? :");
        int n = input.nextInt();

        double[] matriz = new double[n];
        double soma = 0.0;

        for(int i=0; i<matriz.length;i++){
            System.out.print("Digite um número: ");
            double numero = input.nextDouble();
            matriz[i] = numero;
            soma += numero;
        }

        System.out.printf("%nValores: ");
        for(int i=0; i< matriz.length; i++){
            System.out.print(matriz[i] + "  ");
        }
        System.out.printf("%nSOMA = %.2f%nMEDIA = %.2f",soma,soma/n);

        input.close();
    }

}
