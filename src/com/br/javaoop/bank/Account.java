package com.br.javaoop.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

//Classes are used to be a blueprint, for example a Cake Receipt is a blueprint, while the cake itself is an instance.
public abstract class Account {
    private Integer accountNumber;
    private Client client;
    private Double balance = 0.0;
    private Double limit = 0.0;
    private final LocalDate openDate = LocalDate.now();
    //When we want to share across all the instances and the attribute does not belong to an instance
    //we can create as static. When we declare as static attribute now it belongs to the class and not
    //to the instance itself.
    private static int totalAccounts;

    public Account(Integer accountNumber, Client client, Double balance, Double limit) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
        this.limit = limit;
        totalAccounts += 1;
    }

//    Default constructor, testing purpose.
    public Account() {
        totalAccounts += 1;
    }

    //Class behaviors are called methods, this means, operations that this class
    //can perform. In order to perform those, it can receive parameters or not.
    public boolean withdraw(Double amount) {
        if(amount <= balance) {
            Double newBalance = balance -= amount;
            setBalance(newBalance);
            return true;
        }
        return false;

    }

    public Double deposit(Double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Not a valid amount of money to be deposited");
        }
        setBalance(balance + amount);
        return getBalance();
    }

    //Here an important, objects are sent by reference, this means
    //sourceAccount is a reference to a place in memory
    //if we change something, for instance the amount
    //this will reflect on that object that is referred in this
    //sourceAccount reference.
    public boolean transferTo(Account sourceAccount, Double amount) {
        if(checkValidAmount(amount)) {
            boolean ableToWithdraw = this.withdraw(amount);
            if(ableToWithdraw) {
                sourceAccount.deposit(amount);
                return true;
            }
        }

        return false;
    }

    protected boolean checkValidAmount(Double amount) {
        return amount >= 0;
    }

    public String printAccountInfo() {
        return " Hi "+this.getClient().firstName() + "\n Your balance: "+this.getBalance()+" \n Account number:"+this.getAccountNumber()+" opened in: "
                +this.getFormattedDate();
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getBalance() {
        return balance;
    }

    //Private access modifier means that this method can only be accessed inside this class.
    //The idea here is also to perform Encapsulation because this setBalance is only used here
    //and more specifically to in withdraw and deposit methods, but we should avoid let other
    //classes access or use this to modify the balance straight to it because we might skip some
    //important business rules.
    private void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu");
        return LocalDate.now().format(formatter);
    }

    public static Integer getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(accountNumber, account.accountNumber);
    }

}
