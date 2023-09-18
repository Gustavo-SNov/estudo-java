package retangulo;

public class Retangulo3 {
    public double perimetro3(double comprimento, double altura){
        return 2*(comprimento + altura);
    }
    public double area3(double comprimento,double altura){
        return comprimento*altura;
    }
    public double diagonal3(double comprimento,double altura){
        return Math.sqrt(Math.pow(comprimento,2) + Math.pow(altura,2));
    }

}
