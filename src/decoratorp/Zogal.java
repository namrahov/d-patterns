package decoratorp;

public class Zogal implements Tea {

    private Tea tea;

    public Zogal(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return  tea.getDescription() + " + Zogal";
    }

}
