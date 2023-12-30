package com.br.javaoop.bank;

public class InternalControl {
    //Login an employee, it does not matter what type of employee only if the employee implements.
    public static String login(Authenticatable employee) {
        //Here is just a sample, this pass could come from other place.
        String pass = "batatinha";
        return employee.auth(pass) ? "Welcome to our very safe internal control" : "Sorry, not the correct pass or insufficient privileges";
    }
}
