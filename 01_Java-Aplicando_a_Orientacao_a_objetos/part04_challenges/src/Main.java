import br.com.alura.part04.currencyconverter.CurrencyConverter;
import br.com.alura.part04.multiplicationtable.MultiplicationTable;
import br.com.alura.part04.rectangularroomcalculator.RectangularRoomCalculator;
import br.com.alura.part04.temperatureconverter.StandardTemperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------- CURRENCY CONVERTER -------");
        CurrencyConverter converter = new CurrencyConverter();
        converter.setDollarExchangeRate(5.07);
        converter.setDollarValue(100);
        System.out.printf("Dollar exchange rate: U$%.2f\n", converter.getDollarExchangeRate());
        System.out.printf("Value in dollars....: U$%.2f\n", converter.getDollarValue());
        System.out.printf("Value in Reais......: R$%.2f\n", converter.convertDollarToReal(converter.getDollarValue()));

        System.out.println("\n--- RECTANGULAR ROOM CALCULATOR ---");
        double area;
        double perimeter;
        RectangularRoomCalculator calculator = new RectangularRoomCalculator();
        calculator.setHeightInMeters(2);
        calculator.setWidthInMeters(4.5);
        System.out.printf("Height = %.2fm\n", calculator.getHeightInMeters());
        System.out.printf("Width = %.2fm\n", calculator.getWidthInMeters());
        area = calculator.calculateArea(calculator.getHeightInMeters(), calculator.getWidthInMeters());
        perimeter = calculator.calculatePerimeter(calculator.getHeightInMeters(), calculator.getWidthInMeters());
        System.out.printf("Area = %.2fm²\n", area);
        System.out.printf("Perimeter = %.2fm\n", perimeter);

        System.out.println("\n------- MULTIPLICATION TABLE ------");
        MultiplicationTable table = new MultiplicationTable();
        table.showMultiplicationTable(9);

        System.out.println("\n------ TEMPERATURE CONVERTER ------");
        StandardTemperatureConverter tempConverter = new StandardTemperatureConverter();
        double  celsiusTemp = 38.9;
        double fahrenheitTemp = tempConverter.celsiusToFahrenheit(celsiusTemp);
        System.out.println(" _______________ _______________");
        System.out.println("|    Celsius    ->  Fahrenheit  |");
        System.out.printf("|    %.2fºC    |    %.2fF    |\n", celsiusTemp, fahrenheitTemp);
        System.out.println(" =============== =============== ");
        fahrenheitTemp = 25.3;
        celsiusTemp = tempConverter.fahrenheitToCelsius(fahrenheitTemp);
        System.out.println("|   Fahrenheit  ->   Celsius    |");
        System.out.printf("|    %.2fF     |    %.2fºC    |\n", fahrenheitTemp, celsiusTemp);
        System.out.println(" _______________ _______________ ");

    }
}
