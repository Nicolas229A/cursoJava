package interfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Aula54JRadioButton extends JFrame {

    JRadioButton masculino = new JRadioButton("Masculino");
    JRadioButton feminino = new JRadioButton("Feminino"); // Dizer para o compilador que os dois pertencem ao mesmo grupo, então somente 1 pode ser marcado

    ButtonGroup grupo = new ButtonGroup();

    public Aula54JRadioButton () {

        setLayout(new FlowLayout());
        add(masculino);
        add(feminino);

        grupo.add(masculino);
        grupo.add(feminino);

        setTitle("Título");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String[] args) {
        new Aula54JRadioButton();
    }
}
