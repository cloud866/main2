import mashine.Auto;
import mashine.Wheel;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("Tesla", "Red", new Wheel("Кирзачи"));

        //auto.setWheel(new Wheel("Наташа"));
        auto.turnRight();
        auto.getWheel().setName("Оля");
        auto.turnRight();
    }
}