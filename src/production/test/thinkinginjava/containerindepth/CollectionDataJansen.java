package production.test.thinkinginjava.containerindepth;

import net.mindview.util.Generator;

import java.util.ArrayList;

public class CollectionDataJansen<T> extends ArrayList<T> {
    public CollectionDataJansen(Generator<T> gen, int quantity){
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
    public static <T> CollectionDataJansen<T> list(Generator<T> gen ,int quantity){
        return new CollectionDataJansen<T>(gen,quantity);
    }
}
