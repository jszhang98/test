package production.test.bridge;

public class TestMain {

    public static void main(String[] args){
        Resource p1 = new Product1();
        Resource p3 = new Product3();
        ViewStyle s1 = new Style1(p1);
        s1.showContent();
    }
}
