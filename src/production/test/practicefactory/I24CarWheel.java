package production.test.practicefactory;

public class I24CarWheel implements CarWheel{
    @Override
    public void getSize() {
        System.out.println("24 inch wheel");
    }

    public I24CarWheel() {
        this.getSize();
    }
}
