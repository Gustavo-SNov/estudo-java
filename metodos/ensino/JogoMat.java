package metodos.ensino;

import java.security.SecureRandom;
import java.util.Scanner;

public class JogoMat {
//Scanner input = new Scanner(System.in);
    public static void menu(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%n[TREINAMENTO MATEMÁTICA]%n%n");
        System.out.printf("Qual o seu nome?");
        String nome = input.nextLine();
        Aluno aluno = new Aluno(nome);
    }

    public static int modo() {
        Scanner input = new Scanner(System.in);
        int mod = 0;
        System.out.printf("%n[MODOS DE JOGO]%n[1]ADIÇÃO  [2]SUBTRAÇÃO  [3]MULTIPLICAÇÃO  [4]DIVISÃO  [5]ALEATÓRIO%n%n");
        while (mod < 1 || mod >=5) {
            System.out.println("ESCOLHA: ");
            mod = input.nextInt();
            if (mod < 1 || mod >=5) {
                System.out.printf("%n%n[ESCOLHA INVÁLIDA]%n%n");
            }
        }
        return mod;
    }
    public static int dificuldade(int mod){
        Scanner input = new Scanner(System.in);
        int dif = 0;
        System.out.printf("%n[ESCOLHA A DIFICULDADE]%n%n[1]FÁCIL [2]MÉDIO [3]DIFÍCIL%n");
        while(dif < 1 || dif > 3){
            System.out.println("ESCOLHA: ");
            dif = input.nextInt();
            if (dif < 1 || dif > 3) {
                System.out.printf("%n%n[ESCOLHA INVÁLIDA]%n%n");
            }
        }
        if( mod <=2 ){
            dif++;
        }
        return dif;
    }
    public static int pergunta(int mod,int dif) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        String[] op = {"+", "-", "x", "/"};
        if (mod == 5) {
            mod = 1 + random.nextInt(4);
        }

        int x = 1, y = 10;
        if (dif > 3) {
            x = 100;
            y = 899;
        } else if (dif > 1) {
            x = 10;
            y = 89;
        }

        int n1 = x + random.nextInt(y);
        int n2 = x + random.nextInt(y);
        int perg;
        if (dif == 3) {
            int n3 = x + random.nextInt(y);
            System.out.printf("%n%n[PERGUNTA]: %d %s %d %s %n%n", n1, op[mod - 1], n2, op[mod - 1], n3);
            if (mod == 1) {
                perg = n1 + n2 + n3;
            } else if (mod == 2) {
                perg = n1 - n2 - n3;
            } else if (mod == 3) {
                perg = n1 * n2 * n3;
            } else {
                perg = (n1 / n2) / n3;
            }

        } else {
            System.out.printf("%n%n[PERGUNTA]: %d %s %d %n%n", n1, op[mod - 1], n2);
            if (mod == 1) {
                perg = n1 + n2;
            } else if (mod == 2) {
                perg = n1 - n2;
            } else if (mod == 3) {
                perg = n1 * n2;
            } else {
                perg = (n1 / n2);
            }
        }
        System.out.println("[RESPOSTA]: ");
        int res = input.nextInt();
        if (res == perg) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void optionRespostaPC(int jogo){
        SecureRandom random2 = new SecureRandom();

        int Option = 1 + random2.nextInt(4);
        if (jogo == 1)
        {
            switch (Option)
            {
                case 1:
                    System.out.println("Muito Bom!");
                    break;
                case 2:
                    System.out.println("Excelente!");
                    break;
                case 3:
                    System.out.println("Bom Trabalho!");
                    break;
                case 4:
                    System.out.println("Mantenha um bom Trabalho!");
                    break;
                default:
                    System.out.println("ERRO NAS OPÇÕES");
                    break;
            }
        } else
        {
            switch (Option)
            {
                case 1:
                    System.out.println("Não. Por favor, tente de novo.");
                    break;
                case 2:
                    System.out.println("Errado. Tente mais uma vez.");
                    break;
                case 3:
                    System.out.println("Não desista!");
                    break;
                case 4:
                    System.out.println("Não. Continue tentando!");
                    break;
                default:
                    System.out.println("ERRO NAS OPÇÕES");
                    break;
            }
        }
    }

    public static void desempenho(int certo, int rounds){
        /* Casting ou Conversão Implícita
        double certoDouble = certo;
        double roundsDouble = rounds;
        double d = certoDouble/roundsDouble;
        */
        /* Conversão Explícita */
        double d = ( (double) certo / (double) rounds );
        if (d >= 0.75){
            System.out.printf("Seu desempenho foi de %f%n%n Você está pronto para o próximo nível!",d);
        } else{
            System.out.printf("Seu desempenho foi de %f%n%n Continue tentando para conseguir ir para o próximo nível!",d);
        }
    }

}
