package production.test.practice.abstractfactory;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox crateCheckbox() {
        return new WindowsCheckbox();
    }
}
