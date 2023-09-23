package cursoJavaUdemy.heranca_poliformismo.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Número de contribuintes: ");
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.printf("%nDados contribuinte #%d %n", i);
            System.out.print("Pessoa física ou jurídica (f/j)? : ");
            char tipo = input.next().charAt(0);
            input.nextLine();
            System.out.print("Nome:");
            String nome = input.nextLine();
            System.out.print("Renda anual:");
            Double renda = input.nextDouble();

            if (tipo == 'f'){
                System.out.print("Gastos com saúde:");
                Double saude = input.nextDouble();
                lista.add(new Fisica(nome,renda,saude));
            } else {
                System.out.print("Número de funcionários: ");
                int quantFunc = input.nextInt();
                lista.add(new Juridica(nome,renda,quantFunc));
            }
        }

        System.out.printf("%nImpostos por contribuintes: %n");
        double total = 0.0;
        for(Pessoa p : lista){
            System.out.println(p.getNome() + String.format(": R$ %.2f", p.imposto()));
            total += p.imposto();
        }
        System.out.printf("%nImposto total: %.2f", total);
    }
}
