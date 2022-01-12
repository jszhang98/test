package production.test.thinkinginjava.generic;

import production.test.Cat;

public class B implements A<Cat> {
    @Override
    public Cat returnType(Cat input) {
        return null;
    }
}
