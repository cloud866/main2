public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int n) { balance = n > balance ? 0 : balance - n; } // check that n < balance }

    public void put(int n) {balance += n; }

    public int checkBalance() { return balance; }
}
