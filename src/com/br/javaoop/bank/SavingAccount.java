package com.br.javaoop.bank;

public class SavingAccount extends Account{
    public SavingAccount(Integer accountNumber, Client client, Double balance, Double limit) {
        super(accountNumber, client, balance, limit);
    }

    public SavingAccount() {
    }
}
