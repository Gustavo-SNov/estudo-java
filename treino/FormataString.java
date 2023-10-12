package treino;

import java.util.Scanner;

public class FormataString {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B));             // Return diference of comparative (A - B)
        if( A.compareTo(B) == 1 ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(A + " " +B);
    }

}
