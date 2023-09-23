package cursoJavaUdemy.arquivos.exercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    /*
     * 1- O caminho até a entrada
     * 2- Criar uma pasta "out" e dentro dela um arquivo "summary.csv"
     * 3- Criar lista
     * 4- Ler o arquivo de entrada, criar produto e adicionar na lista
     * 5- Escrever os produtos no arquivo "summary.csv"
     */
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();

        System.out.println("Digite o caminho até a lista:");
        String strEntrada = input.nextLine(); // ==> c:\temp\ex1.txt

        File entrada = new File(strEntrada);
        String strPasta = entrada.getParent(); // ==> c:\temp

        boolean pasta = new File(strPasta + "\\out").mkdir(); //Criou pasta "out"

        String strArq = strPasta + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strEntrada))){
            String line = br.readLine();
            while (line != null){

                String[] produto = line.split(",");
                String nome = produto[0];
                Double valor = Double.parseDouble(produto[1]);
                Integer quantidade = Integer.parseInt(produto[2]);

                lista.add(new Produto(nome,valor,quantidade));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(strArq))){
                for(Produto item : lista){
                    bw.write(item.getNome() + String.format(", %.2f", item.total()));
                    bw.newLine();
                }
                System.out.println("Pasta, arquivo e listas criadas e escritas com sucesso!");
            } catch (IOException e){
                System.out.println("Erro (2)" + e.getMessage());
            }


        } catch (IOException e){
            System.out.println("Erro (1): " + e.getMessage());
        }

        input.close();
    }
}
