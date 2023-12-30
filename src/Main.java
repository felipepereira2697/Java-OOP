import com.br.javaoop.bank.*;

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        //Creating an com.br.javaoop.bank.Account instance
        //Objects are all accessed by REFERENCE that means, when you access the object
        //you are actually accessing a reference to that object
        //Unlike primitive values for example: integer, double, boolean, char, byte
        //See doc: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        RegularAccount acct = new RegularAccount();
        acct.setAccountNumber(12367);
        acct.deposit(1000.0);
        acct.setLimit(3000.0);

        SavingAccount acct2 = new SavingAccount();
        acct.setAccountNumber(183712);
        acct.deposit(2000.0);
        acct.setLimit(3000.0);

        //Why new keyword is so important? When you use new and instantiate a new object, this basically
        //stores a new place in memory for that object and returns a reference for that place that can be
        //used in the variable
        Client arya = new Client("Arya", "Stark", LocalDate.now(), "NF789231");
        acct.setClient(arya);

        System.out.println(acct.printAccountInfo());

        System.out.println(Account.getTotalAccounts());

        //Polymorphism applied here, its the possibility of an object be referenced in different forms,
        //in this case I'm referencing a Manager as an employee because a manager IS A employee
        //What if I tried michael.getBonus()? Since the method invocation happens in execution time Java would know
        //that Michael is actually a manager and print the correct bonus which is bonus defined in the Manager class.
        Manager michael = new Manager("Scranton", "Michael Scott", "12378adj", "ID13928", LocalDate.now(), 60000.0, 3);
        Employee john = new Cashier( "John Doe", "781d", "ID9292", LocalDate.now(), 30000.0);
        Director ellie = new Director("Philadelphia", "Ellie", "8123", "ID142624", LocalDate.now(), 425000.0);
        //Polymorphism comes handy when we want for example have a method that can receive Manager, Cashier, Director
        //but all are employees in the end of the day
        BonusController bonusController = new BonusController();
        bonusController.register(michael);
        bonusController.register(john);
        bonusController.register(ellie);

        michael.setPassword("123");
        ellie.setPassword("batatinha");
        System.out.println(michael);
        System.out.println(john);
        System.out.println(ellie);

        System.out.println("Bonus so far "+bonusController.getTotalBonus());

        System.out.println(InternalControl.login(michael));
        System.out.println(InternalControl.login(ellie));


    }
}