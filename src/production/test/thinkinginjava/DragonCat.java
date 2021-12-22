package production.test.thinkinginjava;

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
        dragonCat.testFunction();
    }

}
