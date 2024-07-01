package interfaceGrafica;

import javax.swing.*;
import java.awt.*;


public class Aula46LayoutFluido extends JFrame {

    JButton botao = new JButton("Primeiro");
    JButton botao2 = new JButton("Segundo");

    public Aula46LayoutFluido () {

        setLayout(new FlowLayout()); //FlowLayout.LEFT -> constante pra alinhar
        add(botao);
        add(botao2);


        setTitle("Layoutzera Fluidasso");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula46LayoutFluido();
    }
}
