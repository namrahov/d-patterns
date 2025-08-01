package decoratorp;

public class MainDecorator {
    public static void main(String[] args) {

        Tea tea = new SimpleTea();

        Sugar sugar = new Sugar(tea);

        System.out.println("sugar = " + sugar.getDescription());

        Zogal sekerliZogalliCay = new Zogal(sugar);

        Zogal zogalliCay = new Zogal(tea);

        System.out.println("zogalliCay="+zogalliCay.getDescription());
        System.out.println("sekerliZogalliCay="+sekerliZogalliCay.getDescription());
    }
}
