public class Deposit extends Account {
    private int period, percent;

    public Deposit(int balance, int period, int percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public void waitDays(int n) { period -= n; }

    public boolean isPeriodExpired() { return period <= 0; }

    public double withdraw() {
        if (period <= 0) {  // if we can withdraw
            double res = Double.parseDouble(String.valueOf(balance * (100 + percent))) / 100;
            balance = 0;  // balance = 0
            return res;
        }
        return 0;  // else return 0
    }
}
