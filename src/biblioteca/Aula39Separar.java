package biblioteca;

public class Aula39Separar {
    public static void main(String[] args) {
        String nome = "Carlos Garcia de Souza";
        String[] nomes = nome.split(" ", 3);
        System.out.println(nomes[2]);
    }
}
