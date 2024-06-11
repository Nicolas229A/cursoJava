package objetos;

public class Aula28Encapsulamento {
        public static void main (String[] args) {
            Aula28ClasseCarro car = new Aula28ClasseCarro();
//            System.out.println(car.marca);
                car.setMarca("Lamborghini");
                System.out.println(car.getMarca());
        }
}
