package br.com.alura.part04.temperatureconverter;

public class StandardTemperatureConverter implements TemperatureConverter {
    @Override
    public double  celsiusToFahrenheit(double celsiusTemp) {
        double tempFahrenheit = ((celsiusTemp * 9) / 5) + 32;
        return tempFahrenheit;
    }
    public double  fahrenheitToCelsius(double fahrenheitTemp) {
        double tempCelsius = ((fahrenheitTemp - 32) * 5) / 9;
        return tempCelsius;
    }

}
