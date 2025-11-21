package SmartBUilliding;

//import Aggregration.Wheel;

public class Sensor {
    private String id;
    private String type;
    private volatile double lastReading;

    public Sensor(String name, String type) {
        this.id = id;
        this.type = type;
        lastReading = 0;
    }

    private Technician[] wheels = new Technician[2];

    protected Sensor(String name) {
        this.id = name;
    }


}
