package part03_challenges;

public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numConta, String nomeTitular, double saldo) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    
}
