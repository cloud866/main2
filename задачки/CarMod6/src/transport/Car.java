package transport;

public class Car extends Transport {
    public String brand;
    public int horsePower;
    public boolean isAwd;
    float acceleration;

    public Car() {
        brand = "Mazda";
        horsePower = 100;
        isAwd = false;
        acceleration = 10;
        type = "Car";
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";
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

    public float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    @Override
    public void ride() {
        //super.ride();
        System.out.println("Riding car");
    }

    public String toString() {
        return "brand = " + brand +"\n"
                + "horsePower = " + horsePower +"\n"
                + "isAwd = " + isAwd +"\n"
                + "acceleration = " + acceleration;
    }
}
