package production.test;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.lang.Integer;
public class Jansen {
    public int x=1;
    private static final Logger logger = Logger.getLogger(Jansen.class.getName());
    private static final Logger logger1 = Logger.getLogger(Jansen.class.getName());
    public static void main(String[] args){
        Jansen1 aa = new Jansen1();
        int i =1;
        Jansen.logger.log(Level.WARNING,"this is a test!");
        Jansen1.logger.log(Level.INFO,"this is Jansen1");
        Integer xx = 0;
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(000|11111);

        Scanner scanner = new Scanner(System.in);
        //the hasNext() function will wait the console imput.
        if(scanner.hasNext()){
            String str1 = scanner.next();
            System.out.println(str1);
        }



        Animal a = new Cat();
        show(a);
        a = new Dog();
        show(a);

        scanner.close();


    }
    @Override
    void eat() {

System.out.println("dog eats");    }    static void show(Animal a){
        a.eat();

    }
}
