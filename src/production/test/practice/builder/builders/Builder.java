package production.test.practice.builder.builders;

import production.test.practice.builder.cars.CarType;
import production.test.practice.builder.components.Engine;
import production.test.practice.builder.components.GPSNavigator;
import production.test.practice.builder.components.Transmission;
import production.test.practice.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
