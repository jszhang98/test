package production.test.thinkinginjava.methodfactory;

public class Checkers implements Game{
    private int moves =0;
    private static final int MOVES = 3;
    @Override
    public boolean move() {
        System.out.println("Checkers Move"+moves);
        return ++moves != MOVES;
    }
}
