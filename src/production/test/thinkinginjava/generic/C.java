package production.test.thinkinginjava.generic;

import production.test.Dog;

public class C implements A<Dog>{
    @Override
    public Dog returnType(Dog input) {
        return null;
    }
}
