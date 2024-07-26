package jogos.jogoDoguinho;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Aula70JogoDoguinho extends JFrame {

    ImageIcon doguinho = new ImageIcon(getClass().getResource("doguinho.gif"));
    ImageIcon explosao = new ImageIcon(getClass().getResource("explosao.gif"));

    JLabel l = new JLabel(doguinho);

    public Aula70JogoDoguinho () {
        editarJanela();
        spawnarDog();
        clicar();
    }

    public void spawnarDog () {

        l.setFocusable(true);
        l.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    l.setIcon(doguinho);
                    moverDog();
                }
            }
        });
    }

    public void moverDog () {
        Random random = new Random();
        int x = random.nextInt(getWidth() - l.getWidth());
        int y = random.nextInt(getHeight() - l.getHeight());
        l.setBounds(x, y, 325, 225);
    }

    public void clicar() {
        l.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                l.setIcon(explosao);
            }
        });
    }

    public void editarJanela () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        add(l);
    }
    public static void main(String[] args) {
        new Aula70JogoDoguinho(); // SwingUtilities.invokeLater(() -> -> Aprender depois
    }
}
