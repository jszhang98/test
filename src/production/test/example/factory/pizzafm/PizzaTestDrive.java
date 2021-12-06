package production.test.example.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();


		//NYPizzaStore x = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		//System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		orderPizzaForClient(nyStore,"cheese");


		//pizza = chicagoStore.orderPizza("cheese");
		//System.out.println("Joel ordered a " + pizza.getName() + "\n");
		orderPizzaForClient(chicagoStore,"cheese");

		//pizza = nyStore.orderPizza("clam");
		//System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		orderPizzaForClient(nyStore,"clam");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
	public static void orderPizzaForClient(PizzaStore ps, String type){
		Pizza p = ps.orderPizza(type);
		System.out.println("Ethan ordered a " + p.getName() + "\n");
	}
}
