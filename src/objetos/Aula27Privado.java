package objetos;

public class Aula27Privado {
    public static void main (String[] args) {
        Aula27ClasseJogo game =  new Aula27ClasseJogo();
        System.out.println(game.titulo);
//        System.out.println(game.senhaDeDesbloqueio);
        System.out.println(game.pegarSenha());
    }
}
