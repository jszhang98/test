package production.test.thinkinginjava.arraysutil;

import java.util.Comparator;

public class CompTypeComparator implements Comparator<CompType> {
    public int compare(CompType o1, CompType o2){
        return(o1.j<o2.j? -1:(o1.j==o2.j? 0:1));
    }
}