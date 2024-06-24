package basico;

import java.util.Scanner;

public class Aula35Leitura {
    public static void main(String[] args) {
        Scanner lendoIssoDaqui = new Scanner(System.in);
        String leitura = lendoIssoDaqui.nextLine();
        System.out.println("Leitura: " + leitura);
        int contagem = lendoIssoDaqui.nextInt();
        System.out.println("Contagem: " + contagem);
        double contagemRacional = lendoIssoDaqui.nextDouble();
        System.out.println("Contagem Racional: " + contagemRacional);

    }
}