package application;
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean check;
    private int parameter;

    public TemperatureSensor(){
        this.check = false;
    }

    public boolean isOn(){
        return this.check;
    };  

    public void setOn(){
        this.check = true;
    };

    public void setOff(){
        this.check = false;
    };

    public int read(){
        if (isOn()) {
            this.parameter = new Random().nextInt(61)-30;  
            return this.parameter;
        }     
        throw new IllegalStateException();
    };
}
