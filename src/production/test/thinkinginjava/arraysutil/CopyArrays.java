package production.test.thinkinginjava.arraysutil;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args){
        int[] i = new int[7];
        int[] j = new int[10];
        //fill all elements with the seconds parameter.
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println("i="+Arrays.toString(i));
        System.out.println("j="+Arrays.toString(j));
        System.arraycopy(i,0,j,0,i.length);
        int[] k = new int[5];
        Arrays.fill(k,103);
        System.arraycopy(i,0,k,0,k.length);
        System.out.println("k="+Arrays.toString(k));
        System.arraycopy(k,0,i,0,k.length);
        System.out.println(Arrays.toString(i));

        //Objets:
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u,new Integer(47));
        Arrays.fill(v,new Integer(99));
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(v));
        System.arraycopy(v,0,u,0,v.length);
        System.out.println("u="+Arrays.toString(u));

    }
}
