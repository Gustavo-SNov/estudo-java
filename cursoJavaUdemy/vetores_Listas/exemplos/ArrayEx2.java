package cursoJavaUdemy.vetores_Listas.exemplos;

public class ArrayEx2
{
    public static void main(String[] args)
    {
        // dados=responses -- frequencia=frequency -- dado=answer -- dads=rating
        int[] dados = {1,2,4,5,3,3,2,1,4,4,2,3,5,5,1,2,3,4,1,1}; //responses

        int[] frequencia = new int[6]; // frequency

        for (int dado = 0; dado < dados.length; dado++) // answer

        /* Tratamento de exceção:
           try executa o código e o catch trata a exceção!*/
        {
            try
            {
                ++frequencia[dados[dado]];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf("   responses[%d] = %d%n%n",dado,dados[dado]);

            }
        }

        System.out.printf("%s%12s%n","Dados","Frequencia");


        for( int dads = 1; dads < frequencia.length ; dads++)
            System.out.printf("%5d%10d%n",dads,frequencia[dads]);
    }
}