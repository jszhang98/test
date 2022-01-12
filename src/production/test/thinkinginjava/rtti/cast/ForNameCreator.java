package production.test.thinkinginjava.rtti.cast;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static List<Class<?extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
        "production.test.thinkinginjava.rtti.cast.Mutt",
        "production.test.thinkinginjava.rtti.cast.Pug" ,
        "production.test.thinkinginjava.rtti.cast.EgyptianMau",
        "production.test.thinkinginjava.rtti.cast.Manx" ,
        "production.test.thinkinginjava.rtti.cast.Cymric",
        "production.test.thinkinginjava.rtti.cast.Rat",
        "production.test.thinkinginjava.rtti.cast.Mouse",
        "production.test.thinkinginjava.rtti.cast.Hamster"
    };
    private static void loader(){
        try{
            for(String name: typeNames){
                types.add((Class<?extends Pet>)Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Class<? extends Pet>> types() {

        return types;
    }
    ForNameCreator() {loader();}
}
