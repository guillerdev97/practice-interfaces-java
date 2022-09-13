import Hamburguesas.HamburguesaConHuevo;
import Hamburguesas.HamburguesaPicante;

public class Main {
    public static void main(String[] args) {
        HamburguesaConHuevo hamburgesaConHuevo = new HamburguesaConHuevo();
        hamburgesaConHuevo.añadirBase();
        hamburgesaConHuevo.añadirVegetales();
        hamburgesaConHuevo.añadirHuevo();

        HamburguesaPicante hamburguesaPicante = new HamburguesaPicante();
        hamburguesaPicante.añadirBase();
        hamburguesaPicante.añadirVegetales();
        hamburguesaPicante.añadirSalsaPicante();
    }
}
