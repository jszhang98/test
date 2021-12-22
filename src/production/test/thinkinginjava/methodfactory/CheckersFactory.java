package production.test.thinkinginjava.methodfactory;

public class CheckersFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
