package production.test.thinkinginjava;

import java.util.HashMap;

public class DragonCat extends Cat{

    public DragonCat(){
        System.out.println("this is the constructor of DragonCat.");
    }
    private int x =1 ;
    public void DragonCat (){
        x=6;
    }
    public static void main(String[] args){
        DragonCat dragonCat = new DragonCat();
        HashMap<DragonCat,DragonCat> a =new HashMap<DragonCat,DragonCat>();
        dragonCat.testFunction();
    }

}
