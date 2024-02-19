package observable_pattern.observables;

import observable_pattern.interfaces.DisplayElement;
import observable_pattern.interfaces.Observer;
import observable_pattern.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast conditions: " + temperature + "F degrees and " + humidity + "% humidity" + " and " + pressure + " pressure");
    }

    public void remove() {
        this.weatherData.removeObserver(this);
    }

    public void register() {
        this.weatherData.registerObserver(this);
    }
}
