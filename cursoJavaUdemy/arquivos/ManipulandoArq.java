package cursoJavaUdemy.arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoArq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo/pasta:");
        String strPath = input.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); // Criará uma lista apenas com diretórios/pastas
        System.out.println("Pastas: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // Criará uma lista apenas com arquivos
        System.out.println("Arquivos: ");
        for(File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\pasta3").mkdir(); //Criará uma nova pasta/diretório
        System.out.println("Pasta criada com sucesso? " + sucess);

        boolean arq = new File(strPath + "\\pasta3").mkdir(); //Criará uma nova pasta/diretório
        System.out.println("Pasta criada com sucesso? " + sucess);

        input.close();
    }

}
