package production.test.observable;
import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperture;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperture=weatherData.getTemperture();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current Conditions: "+temperture+"F degrees and "+ humidity+"% humidity.");
    }
}
