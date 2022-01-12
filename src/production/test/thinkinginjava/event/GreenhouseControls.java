package production.test.thinkinginjava.event;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event{

        protected LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }
        public String toString(){
            return "Light is on";
        }
    }
    public class LightOff extends Event{

        protected LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }
        public String toString(){
            return "Light is off";
        }
    }
    private boolean water;
    public class WaterOn extends Event{

        protected WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }
        public String toString(){
            return "Water is on";
        }
    }
    public class WaterOff extends Event{

        protected WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water =false;
        }
        public String toString(){
            return "Water is off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event {

        protected ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }
        public String toString(){
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event {

        protected ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
           thermostat = "Day";
        }
        public String toString(){
            return "Thermostat on day seeting";
        }
    }
    public class Bell extends Event{

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString(){
            return "Bing!";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        protected Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e: eventList){
                addEvent(e);
            }

        }

        @Override
        public void action() {
            for(Event e: eventList){
                e.start();
                addEvent(e);
            }
            this.start();
            addEvent(this);
        }
        public String toString(){
            return "Restarting System";
        }
    }
    public static class Terminate extends Event{
        public Terminate (long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }
        public String toString(){
            return "Terminating";
        }

    }
}
