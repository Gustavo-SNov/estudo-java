package retangulo;

import retangulo.Retangulo2;

import java.util.Locale;
import java.util.Scanner;

public class TesteRetangulo2 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento e a altura: ");
        double comprimento = input.nextDouble();
        double altura = input.nextDouble();

        double are = Retangulo2.area2(comprimento,altura);
        double per = Retangulo2.perimetro2(comprimento,altura);
        double dia = Retangulo2.diagonal2(comprimento,altura);

        System.out.printf("AREA = %.2f%nPerimetro = %.2f%nDiagonal = %.2f%n",are,per,dia);

        input.close();
    }
}
