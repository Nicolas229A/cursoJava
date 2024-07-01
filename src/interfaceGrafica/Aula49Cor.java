package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula49Cor extends JFrame {
    JButton botao = new JButton("Texto");
    Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 100);
    Color cor = new Color(198, 115, 255);
    Color cor2 = new Color(5, 22, 95);

    public Aula49Cor () {

        botao.setFont(fonte);
        botao.setForeground(cor);
        botao.setBackground(cor2);

        add(botao);

        setTitle("Título");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula49Cor();
    }
}
