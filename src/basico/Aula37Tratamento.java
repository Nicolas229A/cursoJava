package basico;

import java.util.Scanner;

public class Aula37Tratamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try {
            int n = ler.nextInt();
            System.out.println(30 / n);
        } catch (Exception erro) { //InputMismatchException ou ArithmeticException -> Individual, tbm para mensagens especificas
            System.out.println("Ocorreu um problema: " + erro);
        } finally {
            System.out.println("FIM");
        }
    }
}
