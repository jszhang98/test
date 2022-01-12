package production.test.thinkinginjava.rtti;

import java.lang.reflect.Type;
import java.text.MessageFormat;

public class SweetShop {
    public static void main(String[] args){
        System.out.println("inside main");
        //Candy s = new Candy();
        Class c1 = Candy.class;
        Type ss = c1.getGenericSuperclass();
        //for(Class c: ss)
        ///    System.out.println(c);
        System.out.println(ss);
        try{
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum") ;
        }
        System.out.println("after class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
