package production.test.factory;

public class ChicagoStyleCheesePiza extends Pizza{
    public ChicagoStyleCheesePiza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
