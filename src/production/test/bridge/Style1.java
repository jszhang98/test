package production.test.bridge;

public class Style1 extends ViewStyle{
    public Style1(Resource r) {
        this.resource = r;
    }

    @Override
    public void showContent() {
        System.out.println(this.resource.showName());
        System.out.println(this.resource.showName());
    }
}
