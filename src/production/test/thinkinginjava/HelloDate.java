package production.test.thinkinginjava;

import java.util.Date;

public class HelloDate {
    String  x = "1";
    public static void main(String args[]){
        System.out.println("Hello, today is :");
        System.out.println(new Date());
        System.out.println("A string of things");
        DragonCat dragonCat = new DragonCat();
        dragonCat.testFunction();
    }
}
