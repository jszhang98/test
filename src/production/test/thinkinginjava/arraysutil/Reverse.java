package production.test.thinkinginjava.arraysutil;

import net.mindview.util.Generated;
import production.test.thinkinginjava.array.Generator;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args){
        CompType[] a = Generated.array(
                new CompType[12], CompType.generator());
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.<CompType>reverseOrder());
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
    }
}
