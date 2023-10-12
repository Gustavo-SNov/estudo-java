package treino;

import java.util.Scanner;
public class FormatacaoPrintf {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] s = new String[3];
        int[] x = new int[3];

        for(int i=0; i<3; i++)
        {
            s[i] = sc.next();
            x[i] = sc.nextInt();

        }


        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            System.out.printf("%-15s%03d%n", s[i], x[i]); // Formatação de printf onde "-15" deixa um espaço de 15 caracteres para string
        }                                                 // %03d deixará 3 espaço para o número

        System.out.println("================================");

    }
}
