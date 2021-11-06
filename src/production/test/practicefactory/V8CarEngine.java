package production.test.practicefactory;

public class V8CarEngine implements CarEngine{
    @Override
    public void getVolume() {
        System.out.println("V8 Volume Engline!");
    }

    public V8CarEngine() {
        this.getVolume();
    }
}
