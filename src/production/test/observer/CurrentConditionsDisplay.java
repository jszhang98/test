package production.test.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperture;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperture,float humidity, float pressure){
        this.temperture=temperture;
        this.humidity=humidity;
        display();
    }

    public void display(){
        System.out.println("Current Conditions: "+temperture+"F degrees and "+ humidity+"% humidity.");
    }
}
