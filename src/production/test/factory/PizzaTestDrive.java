package production.test.factory;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore= new ChicagoPizzaStore();
        Pizza  pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan order a "+ pizza.getName());

        pizza=chicagoStore.orderPizza("cheese");
        System.out.println("Joel order a" + pizza.getName());
    }
}
