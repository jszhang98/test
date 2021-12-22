package production.test.practice.builder.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;
    public Engine(double volume, double mileage) {
       this.volume = volume;
       this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if(started){
            this.mileage += mileage;
        }else{
            System.out.println("Cann't go(), you must start engine first!");
        }
    }

    public double getVolume(){
        return this.volume;
    }

    public double getMileage(){
        return this.mileage;
    }
}
