public class Aircraft {
int number, speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double flight(int n) { return Double.parseDouble(String.valueOf(n / speed)); }  // return how many hours need

}
