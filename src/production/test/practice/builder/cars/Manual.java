package production.test.practice.builder.cars;

import production.test.practice.builder.components.Engine;
import production.test.practice.builder.components.GPSNavigator;
import production.test.practice.builder.components.Transmission;
import production.test.practice.builder.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print(){
        String info = "";
        info += "Type of car:"+ carType +"\n";
        info += "Count of seat:"+ seats +"\n";
        info += "Engine: volume -"+ engine.getVolume() +"; mileage -" + engine.getMileage()+"\n";
        info += "Transmission:"+ transmission +"\n";

        if(this.tripComputer!=null){
            info += "Trip computer: Functional"+"\n";
        }else{
            info += "Trip computer: N/A"+"\n";
        }
        if(this.gpsNavigator!=null){
            info += "GPS Navigator: Functional"+"\n";
        }else{
            info += "GPS Navigator: N/A"+"\n";
        }
        return info;
    }
}
