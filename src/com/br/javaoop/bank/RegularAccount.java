package com.br.javaoop.bank;

public class RegularAccount extends Account implements Taxable{

    public RegularAccount(Integer accountNumber, Client client, Double balance, Double limit) {
        super(accountNumber, client, balance, limit);
    }

    public RegularAccount(){}


    @Override
    public double getTaxValue() {
        return 0.02;
    }
}
