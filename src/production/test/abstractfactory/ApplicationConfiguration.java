package production.test.abstractfactory;

public class ApplicationConfiguration {
    public static void main(String[] args) throws Exception {
        String os = System.getProperty("os.name");
        GUIFactory factory;
        if (os.equals("windows")){
            factory = new WinFactory();
        }else if (os.equals("Mac")){
            factory = new MacFactory();
        }else{
            throw new Exception("Error! Unknown operation system.");
        }
        Application app = new Application(factory);
    }
}
