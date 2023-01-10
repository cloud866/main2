package transport;

public abstract class Car extends Transport {
    protected String brand;
    private int horsePower;
    private boolean isAwd;
    private float acceleration;

    public Car() {
        this("Mazda");
        horsePower = 100;
        isAwd = false;
        acceleration = 10;
        //this.type = "Car";
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        this.type = "Car";
    }

    public Car(String brand) {
        super("Car");
        this.brand = brand;
    }

    public abstract void start();

    //public void start() {
//        System.out.printf(brand + "was started");
//    }

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
        if(acceleration <= 0) {
            this.acceleration = 10;
        } else {
            this.acceleration = acceleration;
        }
    }

    public float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    @Override
    public void ride() {
        //super.ride();
        System.out.println("Riding car");
    }
    @Override
    public String toString() {
        return "brand = " + brand +"\n"
                + "horsePower = " + horsePower +"\n"
                + "isAwd = " + isAwd +"\n"
                + "acceleration = " + acceleration;
    }
}
