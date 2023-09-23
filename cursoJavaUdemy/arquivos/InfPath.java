package cursoJavaUdemy.arquivos;

import java.io.File;
import java.util.Scanner;

public class InfPath {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo/pasta:");
        String strPath = input.nextLine();

        File path = new File(strPath);

        // exemplo ==> c:\temp\a.txt
        System.out.println("getName: " + path.getName()); //Nome do arquivo
        System.out.println("getParent: " + path.getParent()); //Caminho até o arquivo
        System.out.println("getPath: " + path.getPath()); //Caminho completo
        input.close();
    }
}
