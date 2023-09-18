package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class TesteRetangulo3 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento e a altura: ");
        double comprimento = input.nextDouble();
        double altura = input.nextDouble();

        Retangulo3 ret = new Retangulo3();

        double area = ret.area3(comprimento,altura);
        double perimetro = ret.perimetro3(comprimento,altura);
        double diagonal = ret.diagonal3(comprimento,altura);

        System.out.printf("AREA = %.2f%nPerimetro = %.2f%nDiagonal = %.2f%n",area,perimetro,diagonal);

        input.close();
    }
}
