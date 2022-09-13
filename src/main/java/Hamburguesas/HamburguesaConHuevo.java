package Hamburguesas;

public class HamburguesaConHuevo implements BurguerBase, Vegetales, Huevo{
    public HamburguesaConHuevo() {
        System.out.println("Hamburguesa con vegetales y huevo");
    }

    public void añadirBase() {
        System.out.println("Añadiendo pan y carne");
    }

    public void añadirVegetales() {
        System.out.println("Añadiendo vegetales");
    }


    public void añadirHuevo() {
        System.out.println("Añadiendo un huevo");
    }
}
