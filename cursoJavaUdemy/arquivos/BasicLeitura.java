package cursoJavaUdemy.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicLeitura {
    public static void main(String[] args){

        File file = new File("c:\\temp\\a.txt"); // Instância do objeto file
        Scanner input = null; //
        try {
            input = new Scanner(file);
            while (input.hasNextLine()){                        //Enquanto houver uma linha no arquivo
                System.out.println(input.nextLine());           //Lê e exibe
            }
        } catch(IOException e){                                 //Exceções de Entrada e Saída, como FileNotFoundException ou EOFException
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (input != null){
                input.close();
            }
        }


    }
}
