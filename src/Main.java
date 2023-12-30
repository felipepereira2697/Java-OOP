import com.br.javaoop.bank.Account;
import com.br.javaoop.bank.Client;

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        //Creating an com.br.javaoop.bank.Account instance
        //Objects are all accessed by REFERENCE that means, when you access the object
        //you are actually accessing a reference to that object
        //Unlike primitive values for example: integer, double, boolean, char, byte
        //See doc: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        Account acct = new Account();
        acct.setAccountNumber(12367);
        acct.deposit(1000.0);
        acct.setLimit(3000.0);

        Account acct2 = new Account();
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

    }
}