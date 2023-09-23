package cursoJavaUdemy.retangulo;

public class Retangulo {
    public double comprimento;
    public double altura;

    public double area(){
        return comprimento * altura;
    }
    public double perimetro(){
        return 2*(comprimento + altura);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(comprimento,2) + Math.pow(altura,2) );
    }
}
