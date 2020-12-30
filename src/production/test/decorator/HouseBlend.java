package production.test.decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(int size){
        this.size=size;
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        if (this.getSize()==0){
            return 0.89;
        }else if(this.getSize()==1){
            return 0.90;
        }else if(this.getSize()==2){
            return 0.91;
        }else{
            return 0.89;
        }


    }
}
