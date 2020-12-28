package production.test.observable;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    //private ArrayList<Observer> observers;
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData(){

    }


    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperture, float humidity, float pressure){
        this.temperture=temperture;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }
    public float getTemperture(){
        return temperture;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }
    //Other WeatherData method here.
}
