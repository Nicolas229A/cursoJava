package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula55JComboBox extends JFrame {

    JComboBox<String> caixa = new JComboBox();

    public Aula55JComboBox () {

        setLayout(new FlowLayout());
        add(caixa);

        caixa.addItem("Carlos");
        caixa.addItem("Brasil");
        caixa.addItem("Jamal");

        caixa.setSelectedIndex(2);
        System.out.println(caixa.getSelectedIndex());

        setTitle("Título");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula55JComboBox();
    }
}
