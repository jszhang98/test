package production.test.practice.factory;

public class HTMLButton implements Button {
    public void render(){
        System.out.println("<button> test <button>");
    }
    public void onClick(){
        System.out.println("click! buttons says - 'Hello World'");
    }
}
