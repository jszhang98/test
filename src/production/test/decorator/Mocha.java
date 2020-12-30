package production.test.decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha (Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }
    public double cost(){
        if (beverage.getSize()==0){
            return .20+beverage.cost();
        }else if(beverage.getSize()==1){
            return .21+beverage.cost();
        }else if(beverage.getSize()==2){
            return .22+beverage.cost();
        }else{
            return .20+beverage.cost();
        }
    }
}
