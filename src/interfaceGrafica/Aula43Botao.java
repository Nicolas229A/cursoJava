package interfaceGrafica;

import javax.swing.*;

public class Aula43Botao extends JFrame{

    JButton jb = new JButton("Botao 1");
    JButton jb2 = new JButton("Botao 2");

    public Aula43Botao () {

        setLayout(null);
        jb.setBounds(100, 300, 100, 60);
        jb2.setBounds(0, 0, 500, 300);
        add(jb);
        add(jb2);

        setTitle("Ó os butão");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula43Botao();
    }
}
