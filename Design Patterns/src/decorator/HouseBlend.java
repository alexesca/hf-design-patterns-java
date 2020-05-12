package decorator;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "House blend coffe";
	}
	
	public double cost() {
		return .89;
	}
}
