package SmartBUilliding;

import java.util.List;

public class smartBuilding {
    private String name;
    private List<Sensor> sensors;
    public smartBuilding(String name, List<Sensor> sensors) {
        this.name = name;
        this.sensors = sensors;
    }

    public String getName() {
        return name;
    }

    public Sensor addSensor(String id, String type){
        Sensor s = new Sensor(id, type);
        sensors.add(s);
        return s;
    }
    public List<Sensor> getSensors() {
        return sensors;
    }


}
