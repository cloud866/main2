public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship("Михаил Светлов", 1964);
        PassengerShip pShip = new PassengerShip("Куин Элизабет 2", 1967, 1777);

        CargoShip cShip = new CargoShip("Ever Given", 2018, 20_124);
        System.out.println(ship.toString());
        System.out.println(pShip.toString());
        System.out.println(cShip.toString());

    }
}