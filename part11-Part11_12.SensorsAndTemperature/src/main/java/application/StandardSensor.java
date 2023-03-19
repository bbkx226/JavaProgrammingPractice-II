package application;

public class StandardSensor implements Sensor{
    private int seconds;

    public StandardSensor(int seconds){
        this.seconds = seconds;
    }

    public boolean isOn(){
        return true;
    };  

    public void setOn(){

    };

    public void setOff(){

    };

    public int read(){
        return this.seconds;
    };
}
