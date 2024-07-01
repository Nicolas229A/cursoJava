package interfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Aula47LayoutGrid extends JFrame {

    JButton botao = new JButton("Primeiro");
    JButton botao2 = new JButton("Segundo");
    JButton botao3 = new JButton("Terceiro");
    JButton botao4 = new JButton("Quarto");

    public Aula47LayoutGrid () {

        setLayout(new GridLayout(2, 2));
        add(botao);
        add(botao2);
        add(botao3);
        add(botao4);


        setTitle("Layoutzera Gridão");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula47LayoutGrid();
    }
}
