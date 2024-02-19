package observable_pattern;

import observable_pattern.observables.*;
import observable_pattern.interfaces.Observer;
import observable_pattern.subjects.WeatherData;

public class ObservableMain {
    public static void main(String[] args) {
        // Register Weather Data
        WeatherData weatherData = new WeatherData();

        // Register Current Conditions Display
        System.out.println("\nUpdate to Weather App 1");
        Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);

        // Register Statistics Display, Forecast Display, and Third Party Display
        System.out.println("\nUpdate to Weather App 2");
        Observer statisticsDisplay = new StatisticDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer thirdPartyDisplay = new ThirdPlayDisplay(weatherData);
        weatherData.setMeasurements(82, 70, 29.2f);

        // Remove Current Conditions Display, and Third Party Display
        System.out.println("\nUpdate to Weather App 3");
        statisticsDisplay.remove();
        forecastDisplay.remove();
        weatherData.setMeasurements(78, 90, 29.2f);

        // Register Statistics display again and remove Current Conditions Display and Third Party Display
        System.out.println("\nUpdate to Weather App 4");
        statisticsDisplay.register();
        currentDisplay.remove();
        thirdPartyDisplay.remove();
        weatherData.setMeasurements(78, 90, 29.2f);

        // Add Heat Index Display
        System.out.println("\nUpdate to Weather App 5");
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}