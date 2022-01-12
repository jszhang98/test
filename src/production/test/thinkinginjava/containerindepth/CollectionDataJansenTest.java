package production.test.thinkinginjava.containerindepth;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionDataJansenTest {
    public static void main(String[] args){
        List<String> list= new ArrayList<String>(new CollectionDataJansen<String>(new Government(),15));
        list.addAll(CollectionDataJansen.list(new Government(),15));
    }
}

