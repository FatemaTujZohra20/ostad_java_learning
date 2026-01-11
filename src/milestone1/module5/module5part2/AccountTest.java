package milestone1.module5.module5part2;

class Account {
    private final String accountNo;
    private int balance;


    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
        }
    }
}


public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("456", 1000);
        System.out.println("Current balance is: " + a1.getBalance());
        a1.deposit(100);
        System.out.println("Current balance is: " + a1.getBalance());
        a1.withdraw(500);
        System.out.println("Current balance is: " + a1.getBalance());
        a1.withdraw(1000);
        System.out.println("Current balance is: " + a1.getBalance());
    }

}
