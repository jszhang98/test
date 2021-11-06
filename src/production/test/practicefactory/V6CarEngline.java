package production.test.practicefactory;

public class V6CarEngline implements CarEngine{

    @Override
    public void getVolume() {
        System.out.println("V6 Engine");
    }

    public V6CarEngline() {
        this.getVolume();
    }
}
