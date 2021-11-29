package production.test.composite;

import production.test.example.combining.factory.CountingDuckFactory;

import java.util.ArrayList;
import java.util.Iterator;

public class ImageEditor {
    public static void main(String[] args){

        ArrayList<Graphic> a1 = new ArrayList<Graphic>();
        CompoundGraphic all = new CompoundGraphic(a1);
        all.add(new Dot("dot1",0,0,11));
        all.add(new Circle("circle1",10,10,22));

        ArrayList<Graphic> a2 = new ArrayList<Graphic>();
        CompoundGraphic group = new CompoundGraphic(a2);
        group.add(new Dot("Dot2",20,20,33));
        group.add(new Circle("Circle2",30,30,44));

        all.add(group);

        ArrayList<Graphic> a3 = new ArrayList<Graphic>();
        CompoundGraphic group1 = new CompoundGraphic(a3);
        group.add(new Dot("Dot3",20,20,55));
        group.add(new Circle("Circle3",30,30,66));

        group.add(group1);
        if (a3 != null) {

        }
        Iterator x = a3.iterator();
        Iterator y = a3.iterator();
        all.draw();
        all.move(100,100);
        System.out.println("The total price is : "+ all.compute());


    }
}
