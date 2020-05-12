package simple_factory_pizza;

public class California extends PizzaStore {
	Pizza createPizza(String item) {
		if(item.equals("Cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else return null;
	}

}
