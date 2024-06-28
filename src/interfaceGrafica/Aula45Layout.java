package interfaceGrafica;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Aula45Layout extends JFrame { //JFrame usa BorderLayout

    JButton botao = new JButton("North");
    JButton botao2 = new JButton("East");
    JButton botao3 = new JButton("South");
    JButton botao4 = new JButton("West");
    JButton botao5 = new JButton("Center");

    public Aula45Layout () {

        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, botao);
        add(BorderLayout.EAST, botao2);
        add(BorderLayout.SOUTH, botao3);
        add(BorderLayout.WEST, botao4);
        add(BorderLayout.CENTER, botao5); // ocupa o restante


        setTitle("Layoutzera");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula45Layout();
    }
}
