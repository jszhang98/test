package production.test.thinkinginjava.methodfactory;

public class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}
