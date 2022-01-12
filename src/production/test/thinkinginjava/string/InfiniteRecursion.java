package production.test.thinkinginjava.string;

public class InfiniteRecursion {
    public static void main(String[] args) {
        int x = 10;
        double y = 0.2222;
        String uu = "this is a test";
        System.out.format("x=%d y=%f\n", x, y);
        System.out.format("x=%d y=%f\n", x, y);
        System.out.printf("Row 1: x=%d y=%f\n", x, y);
        System.out.printf("Row 1: uu=%s ", uu);
        String u = String.format("x = %d y=%f",x,y);
        System.out.println(u);
    }
    }
