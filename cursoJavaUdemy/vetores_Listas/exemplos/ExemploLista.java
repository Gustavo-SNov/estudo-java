package cursoJavaUdemy.vetores_Listas.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploLista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Gustavo");
        list.add("Felipe");
        list.add("Pedro");
        list.add("Marivaldo");

        list.add(2,"carlos");

        System.out.println(list.size());
        System.out.println();
        for(String x : list){
            System.out.println(x);
        }
        list.remove("carlos");
        list.remove(2);
        list.removeIf(x -> x.charAt(0) == 'F');

        for(String x : list){
            System.out.println(x);
        }
        System.out.println();
        System.out.println("Index de Gustavo: " + list.indexOf("Gustavo"));
        System.out.println("Index de Carlos: " + list.indexOf("Carlos"));
        System.out.println();

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
        System.out.println();
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}
