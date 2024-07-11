package interfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula60ProgramaDeSoma extends JFrame {

    JTextField numero1 = new JTextField();
    JTextField numero2 = new JTextField();
    JLabel mais = new JLabel("+");
    JLabel resultado = new JLabel();

    JButton soma = new JButton("=");

    Font fonte = new Font("Arial", Font.BOLD,50);

    Aula60ProgramaDeSoma() {

        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(numero1.getText());
                int n2 = Integer.parseInt(numero2.getText());
                int soma = n1 + n2;
                resultado.setText(soma+"");
            }
        });

        setLayout(new GridLayout(1, 5));
        add(numero1);
        add(mais);
        add(numero2);
        add(soma);
        add(resultado);

        numero1.setFont(fonte);
        numero2.setFont(fonte);
        mais.setFont(fonte);
        soma.setFont(fonte);
        resultado.setFont(fonte);


        setSize(600, 100);
        setTitle("Soma");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aula60ProgramaDeSoma();
    }

}
