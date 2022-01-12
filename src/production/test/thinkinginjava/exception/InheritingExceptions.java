package production.test.thinkinginjava.exception;

public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String[] args){
        //create an exception
        InheritingExceptions sed = new InheritingExceptions();
        try{
            //handle the exception from f().
            sed.f();
        }catch(SimpleException e){
            //catch the exception
            System.out.println("caught it!");
        }
    }
}
