package treino;
import java.util.Scanner;
public class Lexicographi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        //System.out.println(s.substring(10));
        System.out.println(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int start = 0;
        int end = k;


        for(int i=0; i <=(s.length()-k+1);i++){

            String a = s.substring(start,end);
            String b;
            if(end<=s.length()){
                b = s.substring(start+1,end);
            } else {
                b = s.substring(start+1);
            }


            if(a.compareTo(b) > 0){
                largest = a;
                smallest = b;
            }
            start++;
            end++;
        }


        return smallest + "\n" + largest;
    }
}
