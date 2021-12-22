package production.test.thinkinginjava.decoupling;

import production.test.thinkinginjava.decoupling.processor.Apply;
import production.test.thinkinginjava.decoupling.processor.FiltterAdapter;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FiltterAdapter(new LowPass(1.0)), w);
        Apply.process(new FiltterAdapter(new HighPass(2.0)), w);
        Apply.process(new FiltterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
