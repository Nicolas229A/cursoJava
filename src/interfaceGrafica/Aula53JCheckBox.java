package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula53JCheckBox extends JFrame {

    JCheckBox check = new JCheckBox("Checando", false);

    public Aula53JCheckBox () {


        setLayout(new FlowLayout());
        add(check);
        System.out.println(check.isSelected());

        setTitle("Título");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula53JCheckBox();
    }
}
