package cursoJavaUdemy.vetores_Listas.exPensionato;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa:%n",i+1);
            System.out.print("Nome:");
            nomes[i] = input.next();
            System.out.print("Idade:");
            idades[i] = input.nextInt();
            System.out.print("Altura:");
            alturas[i] = input.nextDouble();
        }
        double media = 0.0, id = 0.0;
        for(int i=0; i<n;i++){
            media += alturas[i];
            if(idades[i] < 16.0){
                id++;
            }
        }
        System.out.printf("Altura média: %.2f%n", media/n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (id/n)*100);
        for(int x=0; x<n; x++){
            if(idades[x] <16.0){
                System.out.println(nomes[x]);
            }
        }
        input.close();
    }

}
