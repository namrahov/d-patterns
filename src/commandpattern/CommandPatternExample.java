package commandpattern;

public class CommandPatternExample {
    public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn on the light
        System.out.println("Testing Light ON:");
        remote.setCommand(lightOn);
        remote.pressButton();
        System.out.println("Light state: " + light.getState());

        // Undo turn on
        System.out.println("\nUndoing Light ON:");
        remote.pressUndo();
        System.out.println("Light state: " + light.getState());

        // Turn off the light
        System.out.println("\nTesting Light OFF:");
        remote.setCommand(lightOff);
        remote.pressButton();
        System.out.println("Light state: " + light.getState());

        // Undo turn off
        System.out.println("\nUndoing Light OFF:");
        remote.pressUndo();
        System.out.println("Light state: " + light.getState());
    }
}
