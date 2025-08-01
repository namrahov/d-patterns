package observer;

public class CurrentConditionsDisplay implements WeatherObserver {
    private String displayName;

    public CurrentConditionsDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(displayName + " - Current conditions: " + temperature + "°C, " +
                humidity + "% humidity, " + pressure + " hPa");
    }
}

