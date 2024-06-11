package objetos;

public class Aula24Estaticos {
    public static void main (String[] args) {
        Aula24ClasseSalaDeAula.professor = "Jhonas";
        Aula24ClasseSalaDeAula.ensinar();

        Aula24ClasseSalaDeAula a1 =  new Aula24ClasseSalaDeAula();
        a1.aluno = "Joãozinho";
        System.out.println(a1.professor);

        Aula24ClasseSalaDeAula a2 =  new Aula24ClasseSalaDeAula();
        a1.aluno = "Maria Gigantesca";
        System.out.println(a2.professor);
    }

}
