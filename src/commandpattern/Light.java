package commandpattern;

public class Light {
    private String state = "off";

    public void turnOn() {
        state = "on";
        System.out.println("Light is ON");
    }

    public void turnOff() {
        state = "off";
        System.out.println("Light is OFF");
    }

    public String getState() {
        return state;
    }
}
