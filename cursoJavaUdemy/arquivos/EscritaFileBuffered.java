package cursoJavaUdemy.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaFileBuffered {
    public static void main(String[] args){
        String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite"};
        String path = "c:\\temp\\b.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //OBS: new FileWriter(var) ==> Cria/Recria arquivos e new FileWriter(var,true) ==> Atualiza
            for(String line : lines){
                bw.write(line);
                bw.newLine(); //Quebra de linha
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
