package exceptions;

public class TerminalServer {
    private double money;

    public double getBalance() {
        return money;
    }

    public boolean addMoney(double amount) {
        this.money += amount;
        return true;
    }

    public boolean takeMoney(double money) {
        if (this.money < money) {
            throw new IllegalArgumentException("Insufficient funds on the account");
        }
        this.money -= money;
        return true;
    }
}