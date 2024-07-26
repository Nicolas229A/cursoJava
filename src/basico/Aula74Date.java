package basico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula74Date {

    public static void main(String[] args) {

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yy");
        String ano = formatar.format(data);
        System.out.println(ano);

    }
}
