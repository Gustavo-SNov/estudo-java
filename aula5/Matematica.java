package aula5;

import java.util.Scanner;

public class Matematica
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.printf("%n%nDigite dois números inteiros separados: ");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            if(n1 <0 || n2 <0){
                break;
            }
            mdc(n1,n2);
            mmc(n1,n2);
        }
    }
    public static void mdc(int n1,int n2)
    {
        int i=2,res = 1;
        do {
            if (n1 % i == 0 && n2 % i == 0){
                res *= i;
            } else if( n1 % i != 0 && n2 % i != 0){
                i++;
            }
            if (n1 % i == 0){
                n1 /= i;
            }
            if(n2 % i == 0){
                n2 /= i;
            }
        } while(n1 != 1 && n2!= 1);
        System.out.printf("%n%nRESULTADO MDC: %d",res);
    }
    public static void mmc(int n1,int n2)
    {
        int i=2, res=1;
        while(true){
            if(n1 % i != 0 && n2 % i !=0){
                i++;
            } else {
                res *= i;
                if (n1 % i ==0){
                    n1 /= i;
                }
                if (n2 % i ==0){
                    n2 /= i;
                }
            }
            if(n1 ==1 && n2==1){
                break;
            }
        }
        System.out.printf("%nRESULTADO MMC:%d",res);
    }

}
