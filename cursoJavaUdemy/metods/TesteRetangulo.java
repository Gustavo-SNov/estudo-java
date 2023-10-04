package cursoJavaUdemy.metods;

import java.util.Locale;
import java.util.Scanner;

public class TesteRetangulo {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Digite o comprimento e a altura: ");
        ret.comprimento = input.nextDouble();
        ret.altura = input.nextDouble();


        System.out.printf("AREA = %.2f%nPerimetro = %.2f%nDiagonal = %.2f%n",ret.area(),ret.perimetro(),ret.diagonal());

        input.close();
    }

}
