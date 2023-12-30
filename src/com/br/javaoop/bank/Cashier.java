package com.br.javaoop.bank;

import java.time.LocalDate;

public class Cashier extends Employee{
    public Cashier(String name, String documentNumber, String identifier, LocalDate joinAt, Double salary) {
        super(name, documentNumber, identifier, joinAt, salary);
    }

    @Override
    public double getBonus() {
        return this.getSalary() *0.12;
    }

    @Override
    public String toString() {
        return "Hi my name is "+this.getName()+" and my bonus is "+this.getBonus();
    }
}
