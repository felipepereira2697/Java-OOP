import java.text.MessageFormat;
import java.time.LocalDate;

//Classes are used to be a blueprint, for example a Cake Receipt is a blueprint, while the cake itself is an instance.
public class Account {
    private Integer accountNumber;
    private Client client;
    private Double balance = 0.0;
    private Double limit = 0.0;
    private final LocalDate openDate = LocalDate.now();

    public Account(Integer accountNumber, Client client, Double balance, Double limit) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
        this.limit = limit;
    }

//    Default constructor, testing purpose.
    public Account() {

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
            return getBalance();
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

    private boolean checkValidAmount(Double amount) {
        return amount >= 0;
    }

    public Double calculateSavings() {
        return balance * 0.1;
    }

    public String printAccountInfo() {
        return " Hi "+this.getClient().firstName() + "\n Your balance: "+this.getBalance()+" \n Account opened in: "
                +this.getOpenDate();
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

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", client=" + client +
                ", balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
