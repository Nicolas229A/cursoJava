package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula48Fonte extends JFrame {
    JButton botao = new JButton("Texto");
    Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 100);

    public Aula48Fonte () {

        botao.setFont(fonte);

        add(botao);

        setTitle("Título");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula48Fonte();
    }
}
