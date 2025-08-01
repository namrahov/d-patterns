package observer;

// Observer interface
interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}
