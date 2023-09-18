package metodos.desenho;

import javax.swing.JOptionPane;
public class Addition
{
    public static void main(String[] args){
        /* "Tipo" "Nome Var" = JOptionPane.showInputDialog("texto");
           JOptionPane.showMessageDialog(null, "texto","Título","Tipo de diálogo"); */

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int soma = n1 + n2;

        JOptionPane.showMessageDialog(null,"Resultado: " + soma,"Soma!",JOptionPane.PLAIN_MESSAGE);

        // Tipos de diálogos de mensagem (Exibe Ícones): ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
    }
}
