package org.example;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String printDetails(){
        String details = "AC NO = " + accountNumber + ", Balance = Rs." + balance;
        return details;
    }

    public void deductBalance(double amount){
        balance = balance - amount;
    }

    public void depositBalance(){
        balance += 500;
    }
}
