package livroJava.metodos;

import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args){
        /*Método NÃO estático, pois precisa criar objeto*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 valores separados por espaço: ");
        double valor1 = input.nextDouble();
        double valor2 = input.nextDouble();
        double valor3 = input.nextDouble();

        /* Métodos estáticos não precisam criar objetos */
        double maior = maximo(valor1,valor2,valor3);

        System.out.println("O maior valor é: " + maior);
    }

    public static double maximo(double x, double y, double z){

        double max = x;

        if (y > max){
            max = y;
        }

        if (z > max){
            max = z;
        }

        return max;
    }
}
