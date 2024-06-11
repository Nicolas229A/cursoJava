package objetos;

public class Aula20MetodosComNParametros {

    int somarNumeros (int ... numeros) {  //Vetor de inteiros
        int soma = 0;
        for(int n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static void main (String[] args) {
        Aula20MetodosComNParametros teste = new Aula20MetodosComNParametros();
        int soma = teste.somarNumeros(12,34,67,89,100);
        System.out.println(soma);
    }
}
