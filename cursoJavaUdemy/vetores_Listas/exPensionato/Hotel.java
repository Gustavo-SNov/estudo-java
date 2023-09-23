package cursoJavaUdemy.vetores_Listas.exPensionato;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        EstudantesHotel[] vet = new EstudantesHotel[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = input.nextInt();


        for(int i=0;i<n;i++){
            System.out.printf("Cliente #%d:%n",i+1);
            System.out.print("Nome:");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Email:");
            String email = input.nextLine();
            System.out.print("Quarto:");
            int quarto = input.nextInt();

            vet[quarto] = new EstudantesHotel(nome,email);
        }
        System.out.println("Quartos Ocupados:");
        for(int i=0;i<10;i++){
            if(vet[i] != null) {
                System.out.println(i+": "+ vet[i]);
            }
        }

    }
}
