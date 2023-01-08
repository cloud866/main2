import transport.Car;
import transport.Rideble;
import transport.Transport;

public class App {
    public static void main(String[] args) {
       Car mazda = new Car();
        //System.out.println(mazda);
        Car lada = new Car("Lada", 80, false, 20.0f);
        //System.out.println(lada);
        float mazdaSpeed = mazda.countSpeed(10);
        System.out.println(mazdaSpeed);
        System.out.println(lada.countSpeed(10));

        mazda.ride();
        new Transport().swim();

    }
}