package SmartBuilding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SensorDataLogger {
    private final String fileName;
//    private final
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public SensorDataLogger(String fileName) {
        this.fileName = fileName;
    }

    public  synchronized void log(String id, String type, double reading) {
        String timestamp = LocalDateTime.now().format(fmt);
        String line = String.format("%s\t%s\t%s\t%s", id, type, reading, timestamp);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("[Logger] Error writing to file: " + e.getMessage());
        }

    }

}
