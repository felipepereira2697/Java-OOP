import com.br.javaoop.bank.*;

import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        //Creating an Account instance
        //Objects are all accessed by REFERENCE that means, when you access the object
        //you are actually accessing a reference to that object
        //Unlike primitive values for example: integer, double, boolean, char, byte
        //See doc: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        RegularAccount acct = new RegularAccount();
        acct.setAccountNumber(12367);
        acct.deposit(1000.0);
        try {
            acct.deposit(-1000.0);
        }catch (IllegalArgumentException ex) {
            System.out.println("Testing exceptions "+ex.getMessage());
        }

        acct.setLimit(3000.0);

        SavingAccount acct2 = new SavingAccount();
        acct2.setAccountNumber(12367);
        acct2.deposit(2000.0);
        acct2.setLimit(3000.0);

        RegularAccount acct3 = new RegularAccount();
        acct3.setAccountNumber(12367);
        acct3.deposit(10010.0);
        acct3.setLimit(3000.0);

        System.out.println("compare to "+acct.compareTo(acct3));


        //Why new keyword is so important? When you use new and instantiate a new object, this basically
        //stores a new place in memory for that object and returns a reference for that place that can be
        //used in the variable
        Client arya = new Client("Arya", "Stark", LocalDate.now(), "NF789231");
        acct.setClient(arya);
        Client jonsnow = new Client("Jon", "Snow", LocalDate.now(), "NF91");
        acct2.setClient(jonsnow);
        System.out.println(acct.printAccountInfo());

        System.out.println(Account.getTotalAccounts());

        //Polymorphism applied here, it's the possibility of an object be referenced in different forms,
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

        System.out.println("All bonus so far "+bonusController.getTotalBonus());

        System.out.println(InternalControl.login(michael));
        System.out.println(InternalControl.login(ellie));

        Bank b = new Bank("Batatinha Bank", 1);
        b.addAccountToBank(acct);
        b.addAccountToBank(acct2);
        b.printBankAccounts();




//        Commented Code - But just to show that this is a valid statement although it does not make sense
//        List lista = new ArrayList();
//        lista.add("Uma string");
//        lista.add(acct);
//        System.out.println(lista);
//        System.out.println(lista);


    }
}