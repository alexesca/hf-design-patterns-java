package simple_factory_pizza;


public class CaliforniaStyleCheesePizza extends Pizza {

	public CaliforniaStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}