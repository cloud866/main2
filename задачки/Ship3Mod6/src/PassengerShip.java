public class PassengerShip extends Ship {
    private int numberOfPassengers;

    public PassengerShip(String name, int yearOfManufacture, int numberOfPassengers) {
        super(name, yearOfManufacture);
        this.numberOfPassengers = numberOfPassengers;
    }

    public String toString() {

        int lastDigit;
        if (numberOfPassengers < 10)
            lastDigit = numberOfPassengers;
        else
            lastDigit = numberOfPassengers % 10;
        String ending;

        if(lastDigit >= 1 && lastDigit <= 4) {
            ending = "а";
        } else {
            ending = "ов";
        }

        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно принять на борт %d пассажир%s.", numberOfPassengers, ending);

        return output;

    }
}
