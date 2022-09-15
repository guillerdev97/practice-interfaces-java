import Hamburguesas.HamburguesaConHuevo;
import Hamburguesas.HamburguesaNormal;
import Hamburguesas.HamburguesaPicante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hamburguesa tradicional: pan, carne y vegetales");
        HamburguesaNormal hamburguesaNormal = new HamburguesaNormal();
        hamburguesaNormal.añadirBase();
        hamburguesaNormal.añadirVegetales();

        System.out.println("---");

        System.out.println("Hamburguesa con huevo: pan, carne, vegetales y huevo");
        HamburguesaConHuevo hamburgesaConHuevo = new HamburguesaConHuevo();
        hamburgesaConHuevo.añadirBase();
        hamburgesaConHuevo.añadirVegetales();
        hamburgesaConHuevo.añadirHuevo();

        System.out.println("---");

        System.out.println("Hamburguesa con salsa picante: pan, carne, vegetales y salsa picante");
        HamburguesaPicante hamburguesaPicante = new HamburguesaPicante();
        hamburguesaPicante.añadirBase();
        hamburguesaPicante.añadirVegetales();
        hamburguesaPicante.añadirSalsaPicante();
    }
}
