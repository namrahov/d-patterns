package observer;

public class ForecastDisplay implements WeatherObserver {
    private String displayName;

    public ForecastDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        String forecast = pressure > 1013 ? "Improving weather" : "Rainy weather";
        System.out.println(displayName + " - Forecast: " + forecast);
    }
}
