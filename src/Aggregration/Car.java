package Aggregration;

public class Car {
    private String make;
    private String model;
    private Wheel[] wheels = new Wheel[4];

    public void setWheels(Wheel wheel, int index) {
        this.wheels[index] = wheel;
    }
}
