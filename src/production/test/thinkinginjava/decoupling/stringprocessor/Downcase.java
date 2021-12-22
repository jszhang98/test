package production.test.thinkinginjava.decoupling.stringprocessor;

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
