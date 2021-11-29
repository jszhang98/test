package production.test;

import java.util.logging.Logger;
import java.util.logging.Level;


public class Jansen {
    private static final Logger logger = Logger.getLogger(Jansen.class.getName());
    private static final Logger logger1 = Logger.getLogger(Jansen.class.getName());
    public static void main(String[] args){
        Jansen aa = new Jansen();

        //Jansen.logger.log(Level.WARNING,"this is a test!");
        //Jansen1.logger.log(Level.INFO,"this is Jansen1");


        Animal test = aa.createAnimal("Cat");
        Animal test1 = aa.createAnimal("Dog");
        Animal test2 = aa.createAnimal ("goose");

        //I don't need to deal with the null value separately. each kind of return value is an object.
        test.display();
        test1.display();
        test2.display();




    }

    public Animal createAnimal(String animalName){
        Animal createdAnimal;
        if (animalName.equals("Cat")){
            createdAnimal=new Cat();
        }else if(animalName.equals("Dog")){
            createdAnimal=new Dog();
        }else{
            createdAnimal=new NullAnimal();
        }
        return createdAnimal;
    }
}
