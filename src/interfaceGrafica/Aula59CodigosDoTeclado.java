package interfaceGrafica;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Aula59CodigosDoTeclado extends JFrame {

    public Aula59CodigosDoTeclado () {

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {

                int codigo = e.getKeyCode();
                int tecla = KeyEvent.VK_ENTER;

                if (codigo == tecla) {
                    System.out.println("Tecla Enter Pressionada");
                }

            }

        });

        setTitle("Título");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula59CodigosDoTeclado();
    }
}
