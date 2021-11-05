package production.test.practicefactory;

public class GreenCarFrame implements CarFrame{

    @Override
    public void getColour() {
        System.out.println("Green Frame!");
    }

    public GreenCarFrame() {
        this.getColour();
    }
}
