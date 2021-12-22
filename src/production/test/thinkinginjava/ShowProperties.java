package production.test.thinkinginjava;

import java.util.Random;

public class ShowProperties {
    public static void main(String[] args){
        System.getProperties().list(System.out);
        Random random = new Random(47);
        System.out.println(random.nextInt(100)+1);
        System.out.println(random.nextInt(100)+1);
        String[] a1 ;
        a1 = new String[]{"1", "2", "4"};
        System.out.println(a1[1]);
        testArray(a1);
        System.out.println(a1[1]);
        HelloDate zz = new HelloDate();
        //int[] a2;
//        a2=a1;
//        for(int i = 0; i < a2.length; i++)
//            a2[i] = a2[i] + 1;



    }
    public static void testArray(String... x){
        x[1]="3333";
    }
}
