package com.br.javaoop.bank;

import java.time.LocalDate;

public record Client(String firstName, String lastName, LocalDate birthDate, String identity){

    public String getFullName() {
        return firstName() + " "+lastName;
    }
}