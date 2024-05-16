import br.com.alura.part04.currencyconverter.CurrencyConverter;
import br.com.alura.part04.multiplicationtable.MultiplicationTable;
import br.com.alura.part04.productandservicepricecalculator.Product;
import br.com.alura.part04.productandservicepricecalculator.Service;
import br.com.alura.part04.productpricecalculator.Book;
import br.com.alura.part04.productpricecalculator.PhysicalProduct;
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

        System.out.println("\n-------------------------------- PRICE CALCULATOR --------------------------------");
        Book book = new Book();
        book.setBookTitle("The Spirity of intimacy");
        double bookPrice = 79.90;
        double bookDiscount = 10;
        int    bookQuantity = 1;
        double bookFinalPrice = bookQuantity * book.calculateFinalPrice(bookPrice, bookDiscount);
        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setProductName("Long Dress");
        double productPrice = 120;
        double productDiscount = 5;
        int    productQuantity = 3;
        double productFinalPrice = productQuantity * physicalProduct.calculateFinalPrice(productPrice, productDiscount);
        System.out.println("Qty.   Description                UnPrice   Disc.   TotalPrice");
        System.out.printf(" %d     '%s'  R$%.2f   %.2f%%  R$%.2f\n",
                bookQuantity, book.getBookTitle(), bookPrice, bookDiscount, bookFinalPrice);
        System.out.printf(" %d     '%s'               R$%.2f   %.2f%%  R$%.2f\n",
                productQuantity, physicalProduct.getProductName(), productPrice, productDiscount, productFinalPrice);
        System.out.printf("TOTAL:............................................. R$%.2f\n", bookFinalPrice + productFinalPrice);

        System.out.println("\n-------- PRODUCT and SERVICE PRICE CALCULATOR --------");
        Service service = new Service();
        service.setServiceName("Pipe repair");
        service.setServicePrice(130);
        service.setHours(4);
        double  serviceFinalPrice = service.calculateProductTotalPrice(service.getHours());
        Product product = new Product();
        product.setProductName("Weldable Pipe 6m");
        product.setProductPrice(18.32);
        product.setQuantity(14);
        double  productFinPrice = product.calculateProductTotalPrice(product.getQuantity());
        System.out.println("Type    Qty/Hours   Description         UnPrice   TotalPrice");
        System.out.printf("%s     %d       '%s'       R$%.2f  R$%.2f\n", service.getType(), service.getHours(),
                            service.getServiceName(), service.getServicePrice(), serviceFinalPrice);
        System.out.printf("%s    %d       '%s'  R$%.2f   R$%.2f\n", product.getType(), product.getQuantity(),
                product.getProductName(), product.getProductPrice(), productFinPrice);
    }
}
