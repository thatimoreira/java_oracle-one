# EXERCISES



### BRAZILIAN PORTUGUESE

Prática de conceitos fundamentais de programação orientada a objetos.

- **Herança**: `extends`, a palavra-chave indicando que uma classe herda de outra; a habilidade de sobrescrever métodos herdados, utilizando a anotação`@Override`.

- **Polimorfismo**: para evitar duplicação de métodos, proporcionando uma estrutura de código mais eficiente e coesa.
1. Crie uma classe `Carro` com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse `ModeloCarro` para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
2. Crie uma classe `Animal` com um método emitirSom(). Em seguida, crie duas subclasses: `Cachorro` e `Gato`, que herdam da classe `Animal`. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
3. Crie uma classe `ContaBancaria` com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse `ContaCorrente` que herda da classe `ContaBancaria`. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
4. Crie uma classe `NumerosPrimos` com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, `VerificadorPrimo` e `GeradorPrimo`, que herdam da classe `NumerosPrimos`. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o `VerificadorPrimo` e gerarProximoPrimo() para o `GeradorPrimo`.
   
   
   
   

### ENGLISH

Practice of fundamental object-oriented programming concepts.

* **Inheritance**: Inheritance allows one class to inherit code from another class, using the `extends` keyword. This means that a subclass can reuse the properties and methods of its superclass, promoting code reusability and organization. The `@Override` annotation is used to indicate that a method in the subclass is overriding a method in the superclass. For example, a `Car` class could inherit from a more general `Vehicle` class, inheriting things like how it moves or its basic features.
* **Polymorphism**: Allows objects of different classes to be treated as objects of a common superclass. This promotes code flexibility and readability by allowing methods to be defined in a generic way in the superclass and then overridden in the subclasses to provide specific implementations. This helps to avoid code duplication and maintain a cohesive code structure.
1. Create a `Car` class with methods to represent a specific model over three years. Implement methods to set the model name, average prices for each year, and calculate and display the lowest and highest prices. Add a `CarModel` subclass to create specific instances, using it in the main class to set prices and show information. In other words, it's like having many forms. In programming, it means that different classes can be treated as instances of the same class, making the code more flexible and easier to understand.
2. Create an `Animal` class with a makeSound() method. Then, create two subclasses: `Dog` and `Cat`, which inherit from the `Animal` class. Add the makeSound() method in the subclasses, using the `@Override` annotation to indicate that they are overriding the method. Additionally, add specific methods for each subclass, such as wagTail() for `Dog` and scratchFurniture() for `Cat`.
3. Create a `BankAccount` class with methods to perform banking operations such as deposit(), withdraw(), and checkBalance(). Then, create a `CheckingAccount` subclass that inherits from the `BankAccount` class. Add a specific method for the subclass, such as chargeMonthlyFee(), which deducts a monthly fee from the checking account.
4. Create a `PrimeNumbers` class with methods like checkPrimality() and listPrimes(). Then, create two subclasses, `PrimeChecker` and `PrimeGenerator`, which inherit from the `PrimeNumbers` class. Add a specific method for each subclass, such as checkIfPrime() for `PrimeChecker` and generateNextPrime() for `PrimeGenerator`.


