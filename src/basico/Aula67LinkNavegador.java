package basico;

import java.awt.*;
import java.net.URI;

public class Aula67LinkNavegador {
    public static void main(String[] args) {
        try {

            URI link = new URI("www.google.com");
            Desktop.getDesktop().browse(link);

        } catch (Exception erro) {
          System.out.println(erro);
        }
    }
}
