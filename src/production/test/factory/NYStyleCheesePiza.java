package production.test.factory;


public class NYStyleCheesePiza extends Pizza{
    public NYStyleCheesePiza(){
        name = "NY Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
