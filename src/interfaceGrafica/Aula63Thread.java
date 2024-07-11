package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula63Thread extends JFrame {

    JLabel tempo = new JLabel("0");
    JLabel idade = new JLabel();

    int segundos = 0;

    public Aula63Thread  () {
        editarLayout();
        contarTempo obj = new contarTempo();
        obj.start();
        mostrarMensagem();
//        obj.stop(); - > Não funciona pois é muito inseguro e bostoso - > Procurar uma forma de parar uma Thread (Wilker)

    }

    public void editarLayout() {
        Font fonte = new Font("Arial", Font.BOLD,50);
        Font fonte2 = new Font ("Arial", Font.BOLD, 30);

        add(BorderLayout.NORTH, tempo);
        add(BorderLayout.CENTER, idade);

        tempo.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setFont(fonte);
        tempo.setFont(fonte2);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void contarTempo () {
//        while (true) {
//            segundos++;
//            try {
//                Thread.sleep(1000);
//            } catch (Exception erro) {
//            }
//            tempo.setText(segundos + "");
//        }
    }

    public void mostrarMensagem() {
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));

        int resultado = anoAtual - anoNasc;
        idade.setText("Sua idade é: " + resultado);
        JOptionPane.showMessageDialog(null, "Você gastou " + segundos + " segundos para responder!");
    }

    public static void main(String[] args) {
        new Aula63Thread();
    }

    public class contarTempo extends Thread {
        public void run () {
            while (true) {
                segundos++;
                try {
                    Thread.sleep(1000);
                } catch (Exception erro) {
                }
                tempo.setText(segundos + "");
            }
        }
    }
}
