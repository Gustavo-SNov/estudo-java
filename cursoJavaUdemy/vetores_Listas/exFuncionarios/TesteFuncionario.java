package cursoJavaUdemy.vetores_Listas.exFuncionarios;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for(int i=0; i<n;i++){
            System.out.printf("%nFuncionário #%d:%n",i+1);
            System.out.print("ID:");
            int id = input.nextInt();
            while(!buscarID(list,id)){
                System.out.printf("%nID de funcionário já existente!%nDigite outro:");
                id = input.nextInt();
            }
            System.out.print("Nome:");
            input.nextLine();                                      //Limpar o buffer
            String nome = input.nextLine();
            System.out.print("Salário:");
            double salario = input.nextDouble();

            Funcionario func = new Funcionario(id,nome,salario);
            list.add(func);
        }

        System.out.printf("%nDigite o ID do funcionário que receberá aumento: ");
        int id_func = input.nextInt();

        Funcionario pos = list.stream().filter(x -> x.getId() == id_func).findFirst().orElse(null);

        if( pos == null){
            System.out.println("ID digitado não existe!");
        } else {
            System.out.print("Digita a porcentagem: ");
            double aumento = input.nextDouble();
            pos.aumentoSalario(aumento);
        }

        System.out.printf("%nLista de Funcionários:%n");
        for(Funcionario func : list){
            System.out.println(func);
        }
        input.close();
    }
    public static boolean buscarID(List<Funcionario> list, int id){
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func == null;
    }
}
