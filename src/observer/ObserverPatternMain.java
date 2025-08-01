package observer;

public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay("Display 1");
        ForecastDisplay display2 = new ForecastDisplay("Display 2");

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Simulate weather changes
        System.out.println("First weather update:");
        weatherStation.setMeasurements(25.0f, 65.0f, 1015.0f);

        System.out.println("\nSecond weather update:");
        weatherStation.setMeasurements(22.0f, 70.0f, 1005.0f);

        // Remove one observer
        weatherStation.removeObserver(display1);

        System.out.println("\nThird weather update (Display 1 removed):");
        weatherStation.setMeasurements(20.0f, 75.0f, 1000.0f);
    }
}
