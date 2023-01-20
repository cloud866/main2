public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip(String name, int yearOfManufacture, int tonnage) {
        super(name, yearOfManufacture);
        this.tonnage = tonnage;
    }

    public String toString() {
        int lastDigit;
        if (tonnage < 10)
            lastDigit = tonnage;
        else
            lastDigit = tonnage % 10;
        String ending;
        if (lastDigit == 1) {
            ending = "у";
        } else if (lastDigit > 1 && lastDigit <= 4) {
            ending = "ы";
        } else {
            ending = "";
        }

        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно перевести %d тонн%s груза.", tonnage, ending);

        return output;
    }
}
