package cursoJavaUdemy.arquivos;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraFileBufferedV2 {
    public static void main(String[] args) {

        String path = "c:\\temp\\a.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine(); // Lê uma linha

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
