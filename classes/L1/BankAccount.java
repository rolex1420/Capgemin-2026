import java.util.Scanner;

class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    void display(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            System.out.println(bankName);
            System.out.println(b.accountHolderName);
            System.out.println(b.accountNumber);
            System.out.println(b.balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int number = sc.nextInt();
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(name, number, bal);
        acc.display(acc);
        System.out.println(getTotalAccounts());
    }
}
