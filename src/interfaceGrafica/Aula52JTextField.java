package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula52JTextField extends JFrame {

    JTextField caixa = new JTextField(30);

    public Aula52JTextField () {

        setLayout(new FlowLayout());

        add(caixa);
        caixa.setText("Vídeo Aula");
        System.out.println(caixa.getText());

        setTitle("Título");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula52JTextField();
    }
}
