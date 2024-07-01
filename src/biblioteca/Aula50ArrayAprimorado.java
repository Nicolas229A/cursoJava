package biblioteca;

import java.util.ArrayList;

public class Aula50ArrayAprimorado {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Jamal");
        nomes.add("Amour");

        nomes.remove(1); //ou o nome

        //nomes.clear(); -> remove tudo

        System.out.println(nomes.toString());
        System.out.println(nomes.get(0));
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains("Amour"));
        System.out.println(nomes.size());
        System.out.println(nomes.indexOf("Carlos"));
    }
}
