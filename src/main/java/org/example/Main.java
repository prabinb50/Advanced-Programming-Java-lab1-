package org.example;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(121515, 6000.00);
        Account account2 = new Account(38989, 1500.00);

        System.out.println(account1.printDetails());
        System.out.println(account2.printDetails());

        account1.deductBalance(10);
        account2.deductBalance(10);

        System.out.println(account1.printDetails());
        System.out.println(account2.printDetails());

        account1.depositBalance();
        System.out.println(account1.printDetails());

        account2.deductBalance(99);
        System.out.println(account2.printDetails());

    }
}