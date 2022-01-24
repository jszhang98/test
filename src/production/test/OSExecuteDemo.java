package production.test;


import production.test.thinkinginjava.OSExecute;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap OSExecuteDemo");
    }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
678 Thinking in Java Bruce Eckel
public OSExecuteDemo();
public static void main(java.lang.String[]);
}
*///:~