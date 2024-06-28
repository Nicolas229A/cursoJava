package interfaceGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula44BotaoAcao extends JFrame implements ActionListener {

    JButton jb = new JButton("Mensagem");
    JButton jb2 = new JButton("Sair");

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb) {
            JOptionPane.showMessageDialog(null, "Salve Rapazeada!");
        }
        if (e.getSource() == jb2) {
            System.exit(0);
        }
    }

    public Aula44BotaoAcao () {

        jb.addActionListener(this);
        jb2.addActionListener(this);

        setLayout(null);
        jb.setBounds(300, 200, 100, 60);
        jb2.setBounds(300, 100, 100, 60);
        add(jb);
        add(jb2);

        setTitle("Vapo");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula44BotaoAcao();
    }
}
