package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    
    private List<Sensor> list;
    private List<Integer> readings;

    public AverageSensor() {
        this.list = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings;
    }

    public boolean isOn() {
        for (Sensor sensor : list) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor sensor : list) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor : list) {
            sensor.setOff();
        }
    }

    public int read() {
        if (isOn()) {
            double average = list.stream()
                    .mapToInt(s -> s.read())
                    .average()
                    .getAsDouble();
            this.readings.add((int) average);
            return (int) average;
        } 
        throw new IllegalStateException();
    }
}
