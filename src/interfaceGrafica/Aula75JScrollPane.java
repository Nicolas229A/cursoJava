package interfaceGrafica;

import javax.swing.*;

public class Aula75JScrollPane extends JFrame {

    JTextArea caixaDeTexto = new JTextArea();
    JScrollPane scroll = new JScrollPane(caixaDeTexto);

    public Aula75JScrollPane () {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        add(scroll);
    }

    public static void main(String[] args) {
        new Aula75JScrollPane();
    }
}
