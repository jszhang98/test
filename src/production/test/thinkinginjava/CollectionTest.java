package production.test.thinkinginjava;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        //
        Integer a = new Integer(2);
        List<Integer> ai = new ArrayList<Integer>();
        ai.add(new Integer(1));
        ai.add(a);
        ai.add(a);
        ai.remove(a);
        ai.remove(a);
        ai.containsAll(ai);

        List<Integer> pets = new ArrayList();
        Iterator<Integer> it = pets.iterator();

    }
}
