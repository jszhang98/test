package production.test.thinkinginjava.array;

import production.test.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison<T> {
    T[] array; // OK
//    @SuppressWarnings("unchecked")
    public ContainerComparison(int size) {
//! array = new T[size]; // Illegal
        array = (T[])new Object[size]; // "unchecked" Warning
    }
    // Illegal:
    public <U> U[] makeArray() {
        return null; }
    public static void main(String[] args){
        ContainerComparison<String> y = new ContainerComparison<String>(10);
        Cat[] cat = y.makeArray();
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for(int i=1;i<5;i++){
            spheres[i]=new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
        for(int i=0;i<5;i++){
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));
        int[] integers = {0,1,2,3,4,5} ;
        System.out.println(Arrays.toString(integers)) ;
        System.out.println(integers[4]);

        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        intList.add(97);
        System.out.println(intList) ;
        System.out.println(intList.get(4));


        int[][] a = {{1,2,3},{4,5,6,}};
        System.out.println(Arrays.deepToString(a));

        int[][][] b = {{{1},{2},{3}},{{4},{5},{6},}};
        System.out.println(Arrays.deepToString(b));
        List<String>[] x ;


    }
}
