package production.test.composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    private ArrayList<Graphic> children;
    private int price = 0;
    public CompoundGraphic(ArrayList<Graphic> children) {
        this.children = children;
    }
    String name;
    @Override
    public void move(int x, int y) {
        for(Graphic child : children) {
            child.move(x,y);
        }
    }

    @Override
    public void draw() {
        for(Graphic child : children) {
            child.draw();
        }
    }

    @Override
    public int compute() {

        for(Graphic child : children){
            price += child.compute();
        }
        return price;
    }


    public void add (Graphic obj){
        children.add(obj);
    }

    public void remove(Graphic obj){
        children.remove(obj);
    }
}
