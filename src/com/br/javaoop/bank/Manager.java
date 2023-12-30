package com.br.javaoop.bank;

import java.time.LocalDate;

//Here we are using a really important concept of OO - Called Inheritance
//This means that this Manager class IS A Employee
//Also means that Employee is a superclass and Manager a subclass
public class Manager extends Employee{
    //Which branch does this manager handles
    private String branchName = "";

    public Manager(String branchName, String name, String documentNumber, String identifier, LocalDate joinAt, Double salary) {
        super(name, documentNumber, identifier, joinAt, salary);
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    //Since it's a method that is override this means that is also defined on the superclass.
    @Override
    public double getBonus() {
        return this.getSalary() * 0.15;
    }

    @Override
    public String toString() {
        return "Hi my name is "+super.getName()+" and I'm a manager at "+this.getBranchName()+" and I have a bonus of "+this.getBonus() ;
    }
}
