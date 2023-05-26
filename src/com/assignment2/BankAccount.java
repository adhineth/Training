package com.assignment2;

public abstract class BankAccount {
    public double balance = 500; //balance is instance variable with public modifier
    private double InterestRate;
    /*
    public double getBalance() {
        return balance;
    }
    */
    public static void main(String[] args) {
        /*
        BankAccount bankAccount = new BankAccount() {
            @Override
            public double getBalance() {
                return super.getBalance();
            }
        }
        */
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.withdraw(250);
        //System.out.println("Balance after trying to withdraw :" + savingsAccount.getBalance());

    }
}
