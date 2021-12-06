package production.test.practice.abstractfactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.crateCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
