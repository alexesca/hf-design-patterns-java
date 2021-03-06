package simple_factory_pizza;



import java.util.ArrayList;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough " + name);
		System.out.println("Adding sauce " + name);
		System.out.println("Adding toppings " + name);
		for(String topping:toppings) {
			System.out.println(" " + topping);
		}
	}

	public String getName() {
		return name;
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}
}

