package objetos;

public class Aula23SobrecargaConstrutores {

    String rankDoValorant;
    int vitorias;

    Aula23SobrecargaConstrutores(String rankDoValorant) {
        this.rankDoValorant = rankDoValorant;
    }

    Aula23SobrecargaConstrutores (String rankDoValorant, int vitorias) {
        this(rankDoValorant);
        this.vitorias = vitorias;
    }

        public static void main (String [] args) {
            Aula23SobrecargaConstrutores objeto = new Aula23SobrecargaConstrutores("Bronze", 21);
            System.out.println(objeto.rankDoValorant);
            System.out.println(objeto.vitorias);
        }


}
