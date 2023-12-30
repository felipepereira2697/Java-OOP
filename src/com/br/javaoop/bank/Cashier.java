package com.br.javaoop.bank;

import java.time.LocalDate;

public class Cashier extends Employee{
    public Cashier(String name, String documentNumber, String identifier, LocalDate joinAt, Double salary) {
        super(name, documentNumber, identifier, joinAt, salary);
    }
}
