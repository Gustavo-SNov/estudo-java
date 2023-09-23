package livroJava.cap8;

public class Time1Teste {
    public static void main(String[] args){

        Time1 teste = new Time1();
        System.out.printf("Valor de criação %s%n%n",teste.toString());

        teste.setTime(10,40,30);
        System.out.printf("Valor após setar: %s%n%n",teste.toString());

        try{
            teste.setTime(25,69,79);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exceção: %s%n%n",e.getMessage());
        }
        System.out.printf("Valor execeção: %s%n%n",teste.toString());
    }
}
