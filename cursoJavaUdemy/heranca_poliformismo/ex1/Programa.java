package cursoJavaUdemy.heranca_poliformismo.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Número de funcionários: ");
        int n = input.nextInt();

        for(int i=0; i<n;i++){
            System.out.printf("%nFuncionário #%d: %n", i+1);
            System.out.print("Terceirizado (s/n)? :");
            char terc = input.next().charAt(0);
            input.nextLine();
            System.out.print("Nome:");
            String nome = input.nextLine();
            System.out.print("Horas:");
            int hora = input.nextInt();
            System.out.print("Valor por hora:");
            double valorHora = input.nextDouble();
            if(terc == 's'){
                System.out.print("Adicional:");
                double adicional = input.nextDouble();
                Funcionario func = new Terceirizado(nome,hora,valorHora,adicional);
                lista.add(func);
            } else {
                Funcionario func = new Funcionario(nome,hora,valorHora);
                lista.add(func);

            }
        }
        System.out.printf("%nPagamentos:%n");
        for(Funcionario f: lista){
            System.out.println(f.getNome() + String.format("- R$ %.2f", f.pagamento()));
        }
    }
}
