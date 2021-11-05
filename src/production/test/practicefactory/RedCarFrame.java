package production.test.practicefactory;

public class RedCarFrame implements CarFrame{

    @Override
    public void getColour() {
        System.out.println("Red Frame!");
    }

    public RedCarFrame() {
        this.getColour();
    }
}
