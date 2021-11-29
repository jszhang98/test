package production.test.composite;

public class Circle implements Graphic{
    private String name;
    private int x;
    private int y;
    private int price;

    public Circle(String name, int x, int y, int price) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.price = price;
    }

    @Override
    public void move(int x, int y) {
        this.x +=x;
        this.y +=y;
        System.out.println("this composite moved to "+x +" and " + y + " from current position");
    }

    @Override
    public void draw() {
        System.out.println("I am "+ name + " I was drawn!");
    }

    @Override
    public int compute() {
        return price;
    }
}
