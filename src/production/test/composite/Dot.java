package production.test.composite;

public class Dot implements Graphic{
    private String name;
    private int x ;
    private int y ;
    private int price;

    public Dot(String name, int x, int y,int price) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.price = price;
    }

    @Override
    public void move(int x, int y) {
        this.x +=x;
        this.y +=y;
        System.out.println("this composite moved to "+x+ " and "+ y + "from the current position.");
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
