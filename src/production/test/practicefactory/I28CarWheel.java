package production.test.practicefactory;

public class I28CarWheel implements CarWheel{
    @Override
    public void getSize() {
        System.out.println("28 Inch wheel!");
    }

    public I28CarWheel() {
        this.getSize();
    }
}
