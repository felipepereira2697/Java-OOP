package com.br.javaoop.bank;

import java.time.LocalDate;

//Here we are using a really important concept of OO - Called Inheritance
//This means that this Manager class IS A Employee
//Also means that Employee is a superclass and Manager a subclass
public class Manager extends Employee implements Authenticatable{
    //Which branch does this manager handles
    private String branchName = "";

    private int managerLevel = 0;

    public Manager(String branchName, String name, String documentNumber, String identifier, LocalDate joinAt, Double salary, int managerLevel) {
        super(name, documentNumber, identifier, joinAt, salary);
        this.branchName = branchName;
        this.managerLevel = managerLevel;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getManagerLevel() {
        return managerLevel;
    }

    public void setManagerLevel(int managerLevel) {
        this.managerLevel = managerLevel;
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

    @Override
    public boolean auth(String pass) {
        return (this.managerLevel > 1 && this.getPassword().equals(pass));
    }
}
