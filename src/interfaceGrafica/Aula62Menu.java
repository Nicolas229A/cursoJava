package interfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula62Menu extends JFrame {

    JMenuBar barra = new JMenuBar();

    JMenu menu1 = new JMenu("Opções");
    JMenu menu2 = new JMenu("Sair");

    JMenuItem item1 = new JMenuItem("Exit");


    public Aula62Menu () {

        setJMenuBar(barra);
        barra.add(menu1);
        barra.add(menu2);

        menu2.add(item1);

        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Menu");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula62Menu();
    }
}
