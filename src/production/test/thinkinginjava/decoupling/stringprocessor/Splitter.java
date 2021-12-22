package production.test.thinkinginjava.decoupling.stringprocessor;

import java.util.Arrays;

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
