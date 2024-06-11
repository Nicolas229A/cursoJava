package basico;

public class Aula15Matriz {
    public static void main (String [] args) {
        String[][] nomes = new String[3][4];
        String [][] nomes2 =  {{"James", "Anão", "Gunn"}, {"James2", "Anão2", "Gunn2"}};
        nomes[0][0] = "Carlos";
        System.out.println(nomes[0][0]);
        System.out.println(nomes2[1][2]);
    }
}
