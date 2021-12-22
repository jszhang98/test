package production.test.practicesingleton;

import production.test.thinkinginjava.DragonCat;

public class TestSingleton {
    public static void main(String[] args) {

            Singleton xx = Singleton.getInstance();
            Singleton yy = Singleton.getInstance();

        DragonCat xxx = new DragonCat();

            //Singleton uu = new Singleton();
    }
}
