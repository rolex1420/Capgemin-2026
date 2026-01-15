class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println(balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ravi", 1234567890L, 5000);
        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}
