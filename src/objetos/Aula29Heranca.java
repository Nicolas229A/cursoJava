package objetos;

public class Aula29Heranca {
    public static void main (String[] args) {
        Aula29ClasseComputador comp = new Aula29ClasseComputador();
        comp.marca = "Dell";
        comp.nomeDoModelo = "Dell G15";
        comp.armazenamento = 1256;
        System.out.println(comp.marca);
        System.out.println(comp.nomeDoModelo);
        System.out.println(comp.armazenamento);
        comp.ligar();

        Aula29ClasseCelular cel = new Aula29ClasseCelular();
        cel.marca = "Samsung";
        cel.nomeDoModelo = "Samsung Galaxy S23 Ultra";
        cel.armazenamento = 512;
        System.out.println(cel.marca);
        System.out.println(cel.nomeDoModelo);
        System.out.println(cel.armazenamento);
        cel.ligar();

    }
}
