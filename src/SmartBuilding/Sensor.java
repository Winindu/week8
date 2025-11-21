package SmartBuilding;

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

    public String getId(){return id;}
    public String getType(){return type;}
    public double getLastReading(){return lastReading;}
//    public synchronized void setLastReading(double newLastReading)


    private Technician[] wheels = new Technician[2];

    protected Sensor(String name) {
        this.id = name;
    }


}
