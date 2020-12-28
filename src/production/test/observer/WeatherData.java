package production.test.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for (int i=0; i< observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temperture,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperture, float humidity, float pressure){
        this.temperture=temperture;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }

    //Other WeatherData method here.
}
