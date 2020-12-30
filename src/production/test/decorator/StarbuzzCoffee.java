package production.test.decorator;

public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+ beverage.cost());

        Beverage beverage3 = new HouseBlend(1);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription()+"$"+beverage3.cost());
    }
}
