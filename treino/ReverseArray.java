package treino;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static List<Integer> reverse(List<Integer> a){
        List<Integer> reverse = new ArrayList<>();

        int n = a.size() - 1;

        int i = 0;
        while(n>=0){
            reverse.add(i,a.get(n));
            i++;
            n--;
        }
        return reverse;
    }
    public static void main(String[] args){

        List<Integer> array = new ArrayList<>();
        array.add(0,1);
        array.add(1,2);
        array.add(2,3);

        List<Integer> res = reverse(array);

        for(Integer x : res){
            System.out.println(x);
        }
    }
}
