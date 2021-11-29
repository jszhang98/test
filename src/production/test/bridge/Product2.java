package production.test.bridge;

public class Product2 implements Resource {
    @Override
    public String showName() {
        return "Jansen";
    }

    @Override
    public String showArtist() {
        return "Jansen Zhang";
    }
}
