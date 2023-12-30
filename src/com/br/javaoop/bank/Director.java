package com.br.javaoop.bank;

import java.time.LocalDate;

public class Director extends Employee{

    private String territoryAssigned;

    public Director(String territoryAssigned, String name, String documentNumber, String identifier, LocalDate joinAt, Double salary) {
        super(name, documentNumber, identifier, joinAt, salary);
        this.territoryAssigned = territoryAssigned;
    }

    @Override
    public double getBonus() {
        return this.getSalary() * 2;
    }

    @Override
    public String toString() {
        return "Hi my name is "+this.getName()+" and I'm responsible for "+this.getTerritoryAssigned()+" I kind have a generous bonus of "+this.getBonus();
    }

    public String getTerritoryAssigned() {
        return territoryAssigned;
    }
}
