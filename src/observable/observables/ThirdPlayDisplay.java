package observable.observables;

import observable.interfaces.DisplayElement;
import observable.interfaces.Observer;
import observable.interfaces.Subject;

public class ThirdPlayDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public ThirdPlayDisplay(Subject weatherData) {
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
        System.out.println("ThirdPlay conditions: " + temperature + "F degrees and " + humidity + "% humidity" + " and " + pressure + " pressure");
    }

    public void remove() {
        this.weatherData.removeObserver(this);
    }

    public void register() {
        this.weatherData.registerObserver(this);
    }
}
