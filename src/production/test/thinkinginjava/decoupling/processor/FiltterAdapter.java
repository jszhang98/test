package production.test.thinkinginjava.decoupling.processor;

import production.test.thinkinginjava.decoupling.Filter;
import production.test.thinkinginjava.decoupling.Waveform;
import production.test.thinkinginjava.decoupling.processor.Processor;

public class FiltterAdapter implements Processor {
    Filter filter;
    public FiltterAdapter(Filter filter) {
        this.filter = filter;
    }
    public String name() { return filter.name(); }
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
