package production.test.thinkinginjava.containerindepth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingList {
    public static void main(String[] args){
        List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello!")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("Worlld!"));
        System.out.println(list);
    }
}
