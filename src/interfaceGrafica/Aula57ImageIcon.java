package interfaceGrafica;

import javax.swing.*;

public class Aula57ImageIcon extends JFrame {

    ImageIcon imagem = new ImageIcon(getClass().getResource("nahIdWin.jpg"));
    JLabel label = new JLabel(imagem);

    public Aula57ImageIcon () {

        add(label);

        setTitle("Título");
        setSize(784, 1145);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula57ImageIcon();
    }
}
