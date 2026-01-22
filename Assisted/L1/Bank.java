import java.util.*;

class Bank {
    String name;
    Map<Customer, Double> accounts = new HashMap<>();

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, double balance) {
        accounts.put(customer, balance);
    }

    double getBalance(Customer customer) {
        return accounts.get(customer);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance(Bank bank) {
        bank.getBalance(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Amit");

        bank.openAccount(c1, 5000);
        c1.viewBalance(bank);
    }
}
