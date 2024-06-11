package objetos;

public class Aula16InicioDeClasses {
    public static void main (String [] args) {
        Aula16e21ClassePessoa eu = new Aula16e21ClassePessoa();
        eu.nome = "Henrique";
        System.out.println(eu.nome);
        eu.durmindoGostoso();

        Aula16e21ClassePessoa outra = new Aula16e21ClassePessoa();
        outra.nome = "GamalJames";
        System.out.println(outra.nome);
    }
}
