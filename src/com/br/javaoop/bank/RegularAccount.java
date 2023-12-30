package com.br.javaoop.bank;

public class RegularAccount extends Account{

    public RegularAccount(Integer accountNumber, Client client, Double balance, Double limit) {
        super(accountNumber, client, balance, limit);
    }

    public RegularAccount(){}


}
