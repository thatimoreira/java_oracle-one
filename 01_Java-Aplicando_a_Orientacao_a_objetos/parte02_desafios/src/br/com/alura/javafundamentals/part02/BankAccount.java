package br.com.alura.javafundamentals.part02;

public class BankAccount {
    private int     accountNumber;
    private double  balance;
    public String   accountHolder;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
