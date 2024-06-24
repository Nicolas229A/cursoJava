package biblioteca;

import javax.swing.JOptionPane;

public class Aula36CaixaDeDialogo {
    public static void main (String[] args) {
        String leitura = JOptionPane.showInputDialog("Qual seu nome? ");
        JOptionPane.showMessageDialog(null, "Salve " + leitura);
        int resposta = JOptionPane.showConfirmDialog(null, "És casado? ");
        System.out.println(resposta);
    }
}
