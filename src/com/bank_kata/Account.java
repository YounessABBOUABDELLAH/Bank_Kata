package com.bank_kata;

import java.text.SimpleDateFormat;
import java.util.*;

public class Account implements AccountService {
    private final List<String> transactions = new ArrayList<>();
    private int balance = 0;
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public void deposit(int amount) {
        balance += amount;
        transactions.add(formatter.format(new Date()) + " | " + amount + "   | " + balance);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        transactions.add(formatter.format(new Date()) + " | -" + amount + "  | " + balance);
    }

    @Override
    public void printStatement() {
        System.out.println("Date       | Amount | Balance");
        Collections.reverse(transactions); // Affichage en ordre antichronologique
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
        Collections.reverse(transactions); // Rétablir l'ordre original
    }
    
    public int getBalance() {
        return balance;
    }

}
