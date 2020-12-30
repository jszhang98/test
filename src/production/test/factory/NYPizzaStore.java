package production.test.factory;


public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePiza();
        }else {
            return null;
        }
    }
}
