package production.test.practice.factory;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }
    static void configure(){
        String sytemType = System.getProperty("os.name");
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HTMLDialog();
        }
    }
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
