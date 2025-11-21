package SmartBuilding;

import java.util.ArrayList;
import java.util.List;

public class Technician {
    private String name;
    private List<Sensor> assignedSensors;

    public Technician(String name) {
        this.name = name;
    }
    private List<Sensor> sensors = new ArrayList<Sensor>();

}
