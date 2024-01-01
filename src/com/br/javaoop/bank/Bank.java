package com.br.javaoop.bank;

public class Bank {
    private String name;
    private int number;
    private Account[] accounts;


    public Bank(String name, int number) {
        this.name = name;
        this.number = number;
        this.accounts = new Account[5];


    }

    public boolean addAccountToBank(Account newAccount) {

        for(int i = 0; i < this.accounts.length ; i++) {
            if(this.accounts[i] != null) {
                continue;
            }else {
                this.accounts[i] = newAccount;
                return true;
            }
        }
        return false;
    }

    public void printBankAccounts() {
        for (Account item : accounts) {
            if(item != null) {
                System.out.println("Account "+item.getAccountNumber()+" from client "+item.getClient().getFullName());
            }

        }
    }


}
