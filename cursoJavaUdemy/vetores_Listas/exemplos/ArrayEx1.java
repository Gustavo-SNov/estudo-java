package cursoJavaUdemy.vetores_Listas.exemplos;

public class ArrayEx1 {

    public static void main(String[] args)
    {
        int[] array = new int[11];

        System.out.printf("%5s%8s%n","Índice","Valor");

        for(int i = 0; i < array.length;i++)
            array[i] = 2*i;

        for (int i = 0;i < array.length;i++)
            System.out.printf("%dx%d=%8d%n",2,i,array[i]);

    }
}
