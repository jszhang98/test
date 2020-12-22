package production.test.duck;

public class FlyWithWins implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
