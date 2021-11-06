package production.test.practicesingleton;

public class Singleton {
    //using static keyword means that only have one variable will be create for this class. and private keyword can protect being accessed from outside of the class.
    static private Singleton st;

    private Singleton() {
        System.out.println("he has only instance.");
    }

    // the other (outside of the class) only have one way to get the instance that is through the method "getInstance".
    //People can not use the new keyword to create a new instance because the it doesn't have the public constructor.
    static public Singleton getInstance(){

        //this if condition can prevent that private variable st only be set value one time.
        if( st == null){
            st = new Singleton();
        }
        return st;
    }

}
