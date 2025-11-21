package Aggregration;

public class AggregationDriver {
    public static void main(String[] args) {
        Wheel wheel1 =new Wheel();
        Wheel wheel2= new Wheel();
        Wheel wheel3= new Wheel();
        Wheel wheel4= new Wheel();

        Car car1 = new Car();
        car1.setWheels(wheel1,0);
        car1.setWheels(wheel2,1);
        car1.setWheels(wheel3,2);
        car1.setWheels(wheel4,3);
    }
}
