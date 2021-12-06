package production.test.practice.abstractfactory;

import java.util.Locale;

public class Demo {
    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
    public static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.equals("mac")){
            factory= new MacOSFactory();
            app = new Application(factory);
        }else{
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

}
