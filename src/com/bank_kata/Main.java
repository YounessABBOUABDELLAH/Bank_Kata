package com.bank_kata;

public class Main {
    public static void main(String[] args) {
        AccountService account = new Account();
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();
    }
}