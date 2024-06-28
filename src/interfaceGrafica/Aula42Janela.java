package interfaceGrafica;

import javax.swing.JFrame;

public class Aula42Janela extends JFrame{ //extendendo não é necessário criar os métodos JFrame jf = new JFrame(); e jf.
    public Aula42Janela () {
        setTitle("Janelão Insano");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula42Janela();
    }
}
