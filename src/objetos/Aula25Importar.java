package objetos;

import objetosImportar.Aula25ClasseAnimal;

public class Aula25Importar {
    public static void main (String[] args) {
        Aula25ClasseJogador objeto = new Aula25ClasseJogador();
        System.out.println(objeto.nome);

        Aula25ClasseAnimal objeto2 = new Aula25ClasseAnimal();
        System.out.println(objeto2.grupo);
        objeto2.fazerBarulho();
    }
}
