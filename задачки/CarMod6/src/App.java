import transport.*;

public class App {
    public static void main(String[] args) {
       Car mazda = new Sedan();
        //System.out.println(mazda);
        Car lada = new Sedan("Lada", 80, false, 20.0f);
        //System.out.println(lada);
        float mazdaSpeed = mazda.countSpeed(10);
        System.out.println(mazdaSpeed);
        System.out.println(lada.countSpeed(10));

        mazda.ride();
        //new Transport().swim();
        Rideble boat = new Boat();
        Rideble transport = new Transport("None");

        rideSomeTransport(mazda);
        rideSomeTransport(boat);
        rideSomeTransport(transport);

    }
    public static void rideSomeTransport(Rideble rideble) {
        rideble.ride();
    }
}