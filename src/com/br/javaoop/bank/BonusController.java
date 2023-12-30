package com.br.javaoop.bank;

public class BonusController {
    private double totalBonus = 0;

    public void register(Employee employee) {
        this.totalBonus += employee.getBonus();
    }

    public double getTotalBonus() {
        return this.totalBonus;
    }
}
