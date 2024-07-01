package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula51JLabel extends JFrame {

    Font fonte = new Font("Serif", Font.BOLD, 50);
    JLabel legenda = new JLabel("Texto");

    public Aula51JLabel () {

        legenda.setFont(fonte);
        legenda.setText("Outro Texto");
        legenda.setHorizontalAlignment(SwingConstants.CENTER);

        add(legenda);

        setTitle("Título");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula51JLabel();
    }
}
