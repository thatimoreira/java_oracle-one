package part03_challenges;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Java");
        stringsList.add("C");
        stringsList.add("C++");
        stringsList.add("C#");
        stringsList.add("Python");

        for (String item : stringsList) {
            System.out.println(item);
        }

        System.out.println("--------------------------------------------");

        Animal animal = new Cachorro("Poseidon", "Pastor Belga de Malinois");
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro)animal;
        } else {
            System.out.println("Objeto não é do tipo Cachorro.");
        }
        System.out.println(animal.getNome());

        System.out.println("--------------------------------------------");

        Produto arCondicionado = new Produto("Ar condicionado", 2700.00, 3);
        Produto aquecedor = new Produto("Aquecedor", 1200.00, 2);
        Produto ventilador = new Produto("Ventilador", 189.90, 10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(arCondicionado);
        listaDeProdutos.add(aquecedor);
        listaDeProdutos.add(ventilador);

        double somaPrecos = 0;

        for (Produto produto : listaDeProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaDeProdutos.size();
        System.out.printf("Preço médio dos produtos: R$%.2f\n", precoMedio);

        System.out.println("--------------------------------------------");

        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(3);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            System.out.printf("Área: %.2f\n", forma.calcularArea());
        }

        System.out.println("--------------------------------------------");
        
        ContaBancaria maria = new ContaBancaria(123456, "Maria", 5090.70);
        ContaBancaria joao = new ContaBancaria(654321, "João", 1000.00);
        ContaBancaria cacau = new ContaBancaria(987654, "Cacau", 10900.81);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(maria);
        listaDeContas.add(joao);
        listaDeContas.add(cacau);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.printf("A conta com maior saldo é de: %s\n", contaMaiorSaldo.getNomeTitular());
        System.out.printf("Saldo: R$%.2f\n", contaMaiorSaldo.getSaldo());
    }
}
