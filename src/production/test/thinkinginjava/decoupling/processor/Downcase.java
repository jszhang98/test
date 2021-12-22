package production.test.thinkinginjava.decoupling.processor;


import production.test.thinkinginjava.decoupling.processor.Processor;

public class Downcase implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}
