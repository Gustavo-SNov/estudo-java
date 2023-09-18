package vetores_Listas.exVetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? :");
        int n = input.nextInt();

        int[] matriz = new int[n];
        for(int i=0; i<n;i++){
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            matriz[i] = numero;
        }
        System.out.printf("%nNúmeros negativos:%n");
        for(int i : matriz){
            if(i<0) {
                System.out.println(i);
            }
        }

        input.close();
    }

}
