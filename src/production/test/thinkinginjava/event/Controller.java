package production.test.thinkinginjava.event;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c ){
        eventList.add(c);
    }
    public void run(){
        while(eventList.size()>0){
            // new ArrayList<Event>(eventList)
            // this will make a copy of the eventList so that you are not modifying the list
            // while you are selecting  the elements in it.
            for (Event e: new ArrayList<Event>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
