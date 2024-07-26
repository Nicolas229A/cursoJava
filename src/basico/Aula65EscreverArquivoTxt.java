package basico;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula65EscreverArquivoTxt {
    public static void main(String[] args) {
        Path caminho = Paths.get("C:/Users/Nicolas/Desktop/Hino.txt"); // Se n tiver, ele cria
        String texto = JOptionPane.showInputDialog("O que quer escrever no arquivo txt? ");
        byte[] textoEmByte = texto.getBytes();
        try {
            Files.write(caminho, textoEmByte);
        } catch (Exception erro) {

        }
    }
}
