# EXERCISES

### BRAZILIAN PORTUGUESE:
"Prática de conceitos fundamentais de programação orientada a objetos em Java: INTERFACES.

 Interfaces: Todos os métodos em uma interface são automaticamente públicos, eliminando a necessidade da palavra
 reservada public em suas declarações. Assim como na herança, é possível aplicar o polimorfismo por meio de interfaces,
 proporcionando flexibilidade e coesão no código.

  1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
     converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como
     parâmetro.
  2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
     calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
     receber altura e largura como parâmetros. 
  3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir
     a tabuada de um número. A classe deve receber o número como parâmetro. 
  4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
     Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e
     exibe os resultados.
  5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
     Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
  6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e
     aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria
     lógica de cálculo de preço."


### ENGLISH version:
    "Practice of fundamental concepts of object-oriented programming in Java - INTERFACE.
    
     Interfaces: All methods in an interface are automatically public, eliminating the need for the public keyword
     in their declarations. Just like with inheritance, it is possible to apply polymorphism through interfaces,
     providing flexibility and cohesion in the code.

     1. Create a class CurrencyConverter that implements a FinancialConversion interface with the method
        convertDollarToReal() to convert a value from dollars to reais. The class should receive the dollar value as a
        parameter.
     2. Create a class RectangularRoomCalculator that implements a GeometricCalculation interface with the methods
        calculateArea() and calculatePerimeter() to calculate the area and perimeter of a rectangular room. The class
        should receive height and width as parameters.
     3. Create a class MultiplicationTable that implements a Table interface with the method showMultiplicationTable()
        to display the multiplication table of a number. The class should receive the number as a parameter.
     4. Create a TemperatureConverter interface with the methods celsiusToFahrenheit() and fahrenheitToCelsius().
        Implement a StandardTemperatureConverter class that implements this interface with the conversion formulas and
        displays the results.
     5. Create a Calculable interface with a method double calculateFinalPrice(). Implement this interface in the Book
        and PhysicalProduct classes, each returning the final price considering discounts or additional fees.
     6. Create a Sellable interface with methods to calculate the total price of a product based on the quantity
        purchased and apply discounts. Implement this interface in the Product and Service classes, each providing its
        own price calculation logic."
