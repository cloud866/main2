package transport;

public class Transport implements Rideble, Swimmable {
    public String type = "None";

    @Override
    public void ride() {
        System.out.println("Riding transport");
    }
}
