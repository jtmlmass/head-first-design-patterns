package observable_pattern.subjects;

import lombok.Data;
import observable_pattern.interfaces.Observer;
import observable_pattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * This method is called whenever the weather measurements have been updated.
     * Instance variable declarations.
     */
    public void measurementsChanged() {
        // Bad way by representing the displays as coded values.
        // currentConditionsDisplay.update(temp, humidity, pressure);
        // statisticsDisplay.update(temp, humidity, pressure);
        // forecastDisplay.update(temp, humidity, pressure);

        // Good way by representing the displays as runtime assigned objects.
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        this.observerList.add(o);
    }

    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
