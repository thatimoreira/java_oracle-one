package br.com.alura.course02.part03challenges.models.bankaccount;

public class CheckingAccount extends BankAccount{
    double  monthlyFee = 27.4;

    public void chargeMonthlyFee(){
        System.out.println("\n........... Monthly Fee Discount ...........");
        System.out.printf("Previous balance.:  R$%.2f\n", this.balance);
        System.out.printf("Monthly fee......: (R$%.2f)\n", monthlyFee);
        this.balance -= monthlyFee;
        System.out.printf("Remaining balance:  R$%.2f\n", this.balance);
    }
}
