package interfaceGrafica;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Aula58CapturarTeclado extends JFrame {

    public Aula58CapturarTeclado () {

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {

                char letra = e.getKeyChar();

                System.out.println(letra);

            }

        });

        setTitle("Título");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula58CapturarTeclado();
    }
}
