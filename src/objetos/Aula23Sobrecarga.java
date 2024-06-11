package objetos;

public class Aula23Sobrecarga {

     int somar (int n1, int n2) { //public static
        return n1 + n2;
    }

    int somar (int n1, int n2, int n3) { //public static
        return this.somar(n1, n2) + n3;
    }

    public static void main (String [] args) {
        Aula23Sobrecarga objeto = new Aula23Sobrecarga();
        int soma = objeto.somar(50, 20, 10);
        System.out.println(soma);
    }
}
