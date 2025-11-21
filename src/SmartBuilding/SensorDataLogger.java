package SmartBuilding;

import java.time.format.DateTimeFormatter;

public class SensorDataLogger {
    private final String fileName;
    private final DateTimeFormatter fat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public SensorDataLogger(String fileName) {
        this.fileName = fileName;
    }

    public void log(String id, String type, double reading) {
    }
}
