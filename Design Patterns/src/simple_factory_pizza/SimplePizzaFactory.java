package simple_factory_pizza;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.contentEquals(("Cheese "))) {
			pizza  = new CheesePizza();
		 } else if (type.equals("pepperoni")) {
			 pizza = new PepperoniPizza();
			 
		 } else if (type.equals("clam")) {
			 pizza = new ClamPizza();
		 } else if (type.equals("veggie")) {
			 pizza = new VeggiePizza();
		 }
		return pizza;
		
	}
}
