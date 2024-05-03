package br.com.alura.course02.part03challenges.models.bankaccount;

public class BankAccount {
    protected int       agencyNumber;
    protected int       accountNumber;
    protected String    accountOwner;
    protected double    balance;

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositValue){
        System.out.println("\n.................. Deposit ..................");
        if (depositValue <= 0){
            System.out.println("Deposit not processed. Invalid deposit value!");
        } else {
            this.balance += depositValue;
            System.out.printf("Current balance: R$%.2f\n", this.balance);
            System.out.println("Successfull deposit!");
        }

    }

    public void withdraw(double withdrawValue){
        System.out.println("\n.................. Withdraw ..................");
        if (withdrawValue <= 0){
            System.out.println("Deposit not processed. Invalid deposit value!");
        } else if (withdrawValue > this.balance){
            System.out.printf("Current balance....:  R$%.2f\n", this.balance);
            System.out.printf("Withdraw value.....: (R$%.2f)\n", withdrawValue);
            System.out.println("Withdraw not processed. Insufficient balance!");
        } else {
            System.out.printf("Previous balance...:  R$%.2f\n", this.balance);
            this.balance -= withdrawValue;
            System.out.printf("Withdraw value.....: (R$%.2f)\n", withdrawValue);
            System.out.printf("Remaining balance..:  R$%.2f\n", this.balance);
            System.out.println("Successfull withdraw!");
        }
    }

    public void checkBalance(){
        System.out.println("\n.................. Balance ..................");
        System.out.printf("Current balance...: R$%.2f\n", this.balance);
    }

    public void displayAccountInfo(){
        System.out.println("\n=================== MY BANK ===================\n");
        System.out.printf("Agency number......: %d\n", this.agencyNumber);
        System.out.printf("Account number.....: %d\n", this.accountNumber);
        System.out.printf("Account owner......: %s\n", this.accountOwner);
        System.out.printf("Initial balance....: R$%.2f\n", this.balance);
        System.out.println("\n==============================================");
    }
}
