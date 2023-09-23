package livroJava.metodos;

import java.security.SecureRandom;

public class RandomInt {

    public static void main(String[] args){
        /* Criação de objeto */
        SecureRandom randomNumber = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++){
            /* Soma 1, pois a classe oferece o zero, ou seja nextInt(6) = {0,1,2,3,4,5}*/
            int face = 1 + randomNumber.nextInt(6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0){
                System.out.println();
            }

        }
    }
}
