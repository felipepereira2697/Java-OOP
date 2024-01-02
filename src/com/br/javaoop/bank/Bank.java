package com.br.javaoop.bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private int number;

    //Every time we can is better to use the interface instead of the specific type
    //so better to return  a List<Account> then ArrayList<Account>
    //If by any chance we change from ArrayList to LinkedList we don't break the attribute/method
    private List<Account> accounts = new ArrayList<>();


    public Bank(String name, int number) {
        this.name = name;
        this.number = number;

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
