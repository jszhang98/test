package production.test.practice.abstractfactory;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox crateCheckbox() {
        return new MacOSCheckbox();
    }
}
