package jogos.jogoAranha;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Aula69JogoAranha extends JFrame {

    ImageIcon iconParede = new ImageIcon(getClass().getResource("parede.png"));
    ImageIcon iconAranhaEscalando = new ImageIcon(getClass().getResource("aranhaEscalando2.gif"));
    ImageIcon iconAranhaParado = new ImageIcon(getClass().getResource("aranhaEscalando.gif"));

    JLabel lParede = new JLabel(iconParede);
    JLabel lAranha = new JLabel(iconAranhaParado);

    int posicaoAranhaX = 300;
    int posicaoAranhaY = 300;

    public Aula69JogoAranha () {
        editarJanela();
        editarComponentes();
        adicionarMovimento();
    }

    public void adicionarMovimento () {

        addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {
                lAranha.setIcon(iconAranhaParado);
            }

            public void keyPressed(KeyEvent e) {

//                System.out.println(e.getKeyCode());

                lAranha.setIcon(iconAranhaEscalando);

                if (e.getKeyCode() == 38) {
                    posicaoAranhaY -= 40;
                }

                if (e.getKeyCode() == 40) {
                    posicaoAranhaY += 40;
                }

                if (e.getKeyCode() == 37) {
                    posicaoAranhaX -= 40;
                }

                if (e.getKeyCode() == 39) {
                    posicaoAranhaX += 40;
                }

                lAranha.setBounds(posicaoAranhaX, posicaoAranhaY, 103, 202);

            }
        });
    }

    public void editarComponentes () {
        lParede.setBounds(0, 0, 800, 700);
        lAranha.setBounds(posicaoAranhaX, posicaoAranhaY, 103, 202);
    }

    public void editarJanela () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        add(lAranha);
        add(lParede);
    }

    public static void main(String[] args) {
        new Aula69JogoAranha();
    }
}
