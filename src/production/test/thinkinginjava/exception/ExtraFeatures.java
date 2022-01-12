package production.test.thinkinginjava.exception;

public class ExtraFeatures {
    public static void f() throws MyException2 {
       System.out.println("throwing MyException2 from f()");
       throw new MyException2();
    }
}
