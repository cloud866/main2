package transport;

public class Transport implements Rideble, Swimmable {
    protected String type = "None";

    public Transport(String type) {
        this.type = type;
    }

    public Transport() {

    }

    @Override
    public void ride() {
        System.out.println("Riding transport");
    }
}
