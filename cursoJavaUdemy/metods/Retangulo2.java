package cursoJavaUdemy.metods;

public class Retangulo2 {
    public static double perimetro2 (double comprimento, double altura){
        return 2*(comprimento + altura);
    }
    public static double area2 (double comprimento,double altura){
        return comprimento*altura;
    }
    public static double diagonal2(double comprimento,double altura){
        return Math.sqrt(Math.pow(comprimento,2) + Math.pow(altura,2));
    }

}
