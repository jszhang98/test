package production.test.turtle;

import java.util.ArrayList;

public class TestTurtle {

    public static void main(String[] args)
    {
        Turtle bob = new Turtle();
        TestTurtle tt = new TestTurtle();
        bob.penColor("red");
        tt.koch(bob,900,5);
    }

    public void koch(Turtle t,int size, int n){
        if(n==0){
            t.forward(size);
        }else{
            ArrayList<Double> list = new ArrayList<Double>();
            list.add((double) 0);
            list.add(60.0);
            list.add((double) -120);
            list.add(60.0);
            for  (Double a:list) {
                t.left(a);
                koch( t, size/3,  n-1);
            }
        }
    }
}
