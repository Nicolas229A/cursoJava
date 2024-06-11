package objetos;

public class Aula30SobrescritaEPolimorfismo {

    public static void barulho(Aula30ClasseAnimal animal) {
        animal.fazerBarulho();
    }
    public static void main (String[] args) {
        Aula30ClasseCachorro dog = new Aula30ClasseCachorro();
//        dog.fazerBarulho();
        Aula30ClasseGato cat =  new Aula30ClasseGato();
//        cat.fazerBarulho();

        barulho(dog);
        barulho(cat);
    }
}
