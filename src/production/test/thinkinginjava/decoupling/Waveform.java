package production.test.thinkinginjava.decoupling;

public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform"+id;
    }
}
