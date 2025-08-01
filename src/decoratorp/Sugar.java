package decoratorp;


public class Sugar implements Tea {

    private Tea tea;

    public Sugar(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
       return tea.getDescription() + " + Sugar";
    }

}
