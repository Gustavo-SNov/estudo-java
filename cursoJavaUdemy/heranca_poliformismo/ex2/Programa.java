package cursoJavaUdemy.heranca_poliformismo.ex2;



import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();

        System.out.print("Número de produtos: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%nProduto #%d: %n", i);
            System.out.print("Comum, usado ou importado (c/u/i)? :");
            char tipo = input.next().charAt(0);
            input.nextLine();
            System.out.print("Nome:");
            String nome = input.nextLine();
            System.out.print("Preço:");
            double preco = input.nextDouble();
            if (tipo == 'i') {
                System.out.print("Taxa de importação: ");
                double taxa = input.nextDouble();
                lista.add(new Importado(nome,preco,taxa));

            } else if (tipo == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                lista.add(new Usado(nome,preco,data));
            } else {
                lista.add(new Produto(nome,preco));
            }
        }
        System.out.printf("%nPrice tags:%n");
        for (Produto p :lista) {
            System.out.println(p.priceTag());
        }
        input.close();
    }
}
