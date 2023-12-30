package com.br.javaoop.bank;

public interface AccountOperations {
    boolean transferTo(Account sourceAccount, Double amount);
    Double deposit(Double amount);
    boolean withdraw(Double amount);
}
