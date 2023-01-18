public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    public void withdraw(int n) {  // redifine method
        balance -= n;
    }

    public int getDebt() { return balance < 0 ? -balance : 0; }  // return debt if balance < 0

}
