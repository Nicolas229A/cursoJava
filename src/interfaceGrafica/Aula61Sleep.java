package interfaceGrafica;

import javax.swing.*;
import java.awt.Font;

public class Aula61Sleep extends JFrame {
    Font fonte = new Font("Arial", Font.BOLD,150);
    JLabel numero = new JLabel("0");

    public Aula61Sleep() {
        numero.setFont(fonte);
        numero.setHorizontalAlignment(SwingConstants.CENTER);

        add(numero);

        setTitle("Programa de Soma");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void contagem () {
        int n = 0;
        while (true) {
            numero.setText(n + "");
            n++;
            try {
                Thread.sleep(1000);
            } catch (Exception erro) {
            }
        }
    }

    public static void main(String[] args) {
        Aula61Sleep obj = new Aula61Sleep();
        obj.contagem();
    }
}
