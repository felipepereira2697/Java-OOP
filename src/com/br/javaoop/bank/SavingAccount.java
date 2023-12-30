package com.br.javaoop.bank;

public class SavingAccount extends Account implements Taxable, AccountOperations{
    public SavingAccount(Integer accountNumber, Client client, Double balance, Double limit) {
        super(accountNumber, client, balance, limit);
    }

    public SavingAccount() {
    }

    @Override
    public double getTaxValue() {
        return 0.01;
    }
}
