package biblioteca;

public class Aula40Alterar {
    public static void main(String[] args) {
        String frase = "Brasil vai ganhar a copa do mundo sim!";
        String novaFrase = frase.replace(" ", "_"); //replaceFirst troca somente a primeira ocorrência
        System.out.println(novaFrase);
    }
}
