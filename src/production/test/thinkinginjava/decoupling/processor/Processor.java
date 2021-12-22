package production.test.thinkinginjava.decoupling.processor;

public interface Processor {
        String name();
        Object process (Object input) ;
}
