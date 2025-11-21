package SmartBuilding;

import java.util.Random;
import java.util.concurrent.Callable;

public class SenserWorker implements Callable<String> {

    private Sensor sensor;
    private SensorDataLogger logger;
    private int updates;
    private Random rand = new Random();

    public SenserWorker(Sensor sensor, SensorDataLogger logger, int updates) {
        this.sensor = sensor;
        this.logger = logger;
        this.updates = updates;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public SensorDataLogger getLogger() {
        return logger;
    }

    public void setLogger(SensorDataLogger logger) {
        this.logger = logger;
    }

    public int getUpdates() {
        return updates;
    }

    public void setUpdates(int updates) {
        this.updates = updates;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    @Override
    public String call() throws Exception {
        try{
            for (int i = 0; i < updates; i++) {
                double reading = rand.nextDouble()*100;
                // double reading = Double.NaN;--Error simulation
                // Simulate possible invalid reading occasionally
                if(rand.nextInt(100)<3){
                    reading = Double.NaN; //Invalid
                }
                try{
                    sensor.updateReading(reading);
                    logger.log(sensor.getId(),sensor.getType(),reading);
                }//End of inner try
                catch (InvalidSensorDataException e){
                    //Handle invalid sensor data gracefully
                    System.err.println("[Worker] "+e.getMessage());
                }


                Thread.sleep(300);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return sensor.getId()+" interrupted";
        }
        return sensor.getId()+" finished";
    }
}
