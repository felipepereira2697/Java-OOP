package com.br.javaoop.bank;

import java.util.Comparator;
import java.util.Objects;

public class RegularAccount extends Account implements Taxable, AccountOperations, Comparable<RegularAccount> {

    public RegularAccount(Integer accountNumber, Client client, Double balance, Double limit) {
        super(accountNumber, client, balance, limit);
    }

    public RegularAccount(){}


    @Override
    public double getTaxValue() {
        return 0.02;
    }

    @Override
    public int compareTo(RegularAccount regularAccount) {
        if(this.getBalance() < regularAccount.getBalance()) {
            return -1;
        }

        if (this.getBalance() > regularAccount.getBalance()) {
            return 1;
        }
        return 0;
    }
}
