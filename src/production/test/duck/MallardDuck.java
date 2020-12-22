package production.test.duck;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior= new FlyWithWins();
    }
    @Override
    public void display() {
        System.out.println("I'm a real MallardDuck!");
    }
}
