package production.test.thinkinginjava.array;

public class GeneratorTest {
    public static int size = 10;
    public static void test(Class<?> surroundingClass){
        for(Class<?> type : surroundingClass.getClasses()){
            System.out.print(type.getSimpleName()+": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for (int i = 0; i < size ; i++) {
                    System.out.print(g.next());
                }
            }catch(Exception e){
                throw new RuntimeException();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //test(CounterGenerator.class);
        test(RandomGenerator.class);
    }
}
