package cursoJava.vetores_Listas.exemplos;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho matriz: ");
        int n = input.nextInt();

        Integer[][] mat = new Integer[n][n];
        System.out.println();

        /*Leitura de uma matriz 2d*/

        for(int i=0; i<mat.length; i++){
            for(int j=0;j<mat[i].length; j++){
                System.out.printf("Elemento[%d][%d]: ",i,j);
                mat[i][j] = input.nextInt();
            }
        }

        /*Exibição de uma matriz 2d*/
        System.out.printf("%nDiagonal da matriz:%n");
        for(int i=0; i<mat.length; i++){
            System.out.print(mat[i][i]+ " ");
        }
    }
}
