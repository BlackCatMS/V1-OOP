package Class02;

public class Account {
    private int number;
    private double saldo;

    public Account(int nr) {
        number = nr;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double amount) {
        saldo = saldo + amount;
    }

    public void withdraw(double amount) {
        saldo = saldo - amount;
    }

    public String toString() {
        return "Account number: " + number + "      Account balance: " + saldo;
    }
}
