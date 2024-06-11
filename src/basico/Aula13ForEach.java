package basico;

public class Aula13ForEach {
    public static void main (String[] args) {
        String[] nomes =  {"Carlos", "Marcelo", "Gabriela"};
        int[] numeros =  {1, 5, 8, 10};
        int soma = 0;

        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int n : numeros) {
            soma = soma + n;
        }
        System.out.println(soma);
    }
}
