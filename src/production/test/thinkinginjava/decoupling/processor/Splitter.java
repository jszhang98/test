package production.test.thinkinginjava.decoupling.processor;

import production.test.thinkinginjava.decoupling.processor.Processor;

import java.util.Arrays;

class Splitter implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}