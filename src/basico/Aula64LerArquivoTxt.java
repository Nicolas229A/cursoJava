package basico;
import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula64LerArquivoTxt {
    public static void main(String[] args) {

        Path caminho = Paths.get("C:/Users/Nicolas/Desktop/Hino.txt");

        try {

            byte[] texto= Files.readAllBytes(caminho);
            String leitura = new String(texto);

            JOptionPane.showMessageDialog(null, leitura);

        } catch (Exception erro) {

        }

    }
}
