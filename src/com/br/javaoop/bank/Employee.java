package com.br.javaoop.bank;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String documentNumber;
    private String identifier;
    private Integer yearsInBank;
    private LocalDate joinAt;
    private Double salary;
    private String password;


    //name, documentNumber, identifier, joinAt, salary
    public Employee(String name, String documentNumber, String identifier, LocalDate joinAt, Double salary) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.identifier = identifier;
        this.joinAt = joinAt;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Integer getYearsInBank() {
        return yearsInBank;
    }

    public void setYearsInBank(Integer yearsInBank) {
        this.yearsInBank = yearsInBank;
    }

    public LocalDate getJoinAt() {
        return joinAt;
    }

    public void setJoinAt(LocalDate joinAt) {
        this.joinAt = joinAt;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBonus() {
        return salary * 0.10;
    }

}
