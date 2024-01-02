package com.br.javaoop.bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private int number;
    private ArrayList<Account> accounts;


    public Bank(String name, int number) {
        this.name = name;
        this.number = number;
        this.accounts = new ArrayList<Account>();


    }

    public boolean addAccountToBank(Account newAccount) {
      if(newAccount != null ){
          this.accounts.add(newAccount);
          return  true;
      }
      return false;
    }

    public void printBankAccounts() {
        for (Account account : this.accounts) {
            System.out.println("-- Account " + account.getAccountNumber() + " from client " + account.getClient().getFullName());
        }
    }


}
