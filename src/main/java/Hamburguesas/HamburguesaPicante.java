package Hamburguesas;

public class HamburguesaPicante implements BurguerBase, Vegetales, SalsaPicante{
    public HamburguesaPicante() {
        System.out.println("Hamburguesa con vegetales y salsa chili");
    }

    public void añadirBase() {
        System.out.println("Añadiendo pan y carne");
    }

    public void añadirVegetales() {
        System.out.println("Añadiendo vegetales");
    }

    public void añadirSalsaPicante() {
        System.out.println("Añadiendo salsa chili");
    }
}
