package production.test.thinkinginjava.dynamicallyproxy;

public class RealObject implements Interface{

    @Override
    public void doSomething() {
        System.out.println("dosomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse "+ arg);

    }
    private void privateMethod(){

    }
    protected void testProtected(){

    }
}
