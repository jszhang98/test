package production.test;

import java.util.logging.Logger;
import java.util.logging.Level;


public class Jansen {
    private static final Logger logger = Logger.getLogger(Jansen.class.getName());
    private static final Logger logger1 = Logger.getLogger(Jansen.class.getName());
    public static void main(String[] args){
        Jansen1 aa = new Jansen1();

        Jansen.logger.log(Level.WARNING,"this is a test!");
        Jansen1.logger.log(Level.INFO,"this is Jansen1");
    }
}
