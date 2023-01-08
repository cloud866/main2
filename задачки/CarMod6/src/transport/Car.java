package transport;

public class Car {
    public String brand;
    public int horsePower;
    public boolean isAwd;
    float acceleration;

    public Car() {
        brand = "Mazda";
        horsePower = 100;
        isAwd = false;
        acceleration = 10;
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    public void start() {
        System.out.printf(brand + "was started");
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isAwd() {
        return isAwd;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setAwd(boolean awd) {
        isAwd = awd;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public String toString() {
        return "brand = " + brand +"\n"
                + "horsePower = " + horsePower +"\n"
                + "isAwd = " + isAwd +"\n"
                + "acceleration = " + acceleration;
    }
}
