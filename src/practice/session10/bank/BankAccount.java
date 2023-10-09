package practice.session10.bank;

public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("The amount is invalid");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("The amount is invalid");
        }
    }

    public double checkBalance() {
        return balance;
    }
}