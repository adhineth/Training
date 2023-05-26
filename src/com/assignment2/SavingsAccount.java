package com.assignment2;

public class SavingsAccount extends BankAccount{
    //instance variable min bal
    public double minimumBalance = 250;

//withdraw() that checks if the withdrawal amount would bring the balance below the minimum and,
// if so, does not allow the withdrawal.
    public void withdraw(int xamount) {
        if (balance >= minimumBalance + xamount) {
            System.out.println("Successful withdrawn!");
        } else {
                System.out.println("Insufficient Balance!");
            }
    }
}
