import transport.Car;

public class App {
    public static void main(String[] args) {
       Car mazda = new Car();
        System.out.println(mazda);
        Car lada = new Car("Lada", 80, false, 20.0f);
        System.out.println(lada);
    }
}