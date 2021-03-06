

import strategy.Duck;
import strategy.DuckCall;
import strategy.FlyRocketPowered;
import strategy.MallardDuck;
import strategy.ModelDuck;
import strategy.Quack;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		System.out.println("Mallard Duck");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println("");
		System.out.println("Model Duck");
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		System.out.println("Changing flying power...");
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		System.out.println("Duck Call");
		DuckCall call = new DuckCall();
		call.setQuackBehaviour(new Quack());
		call.quack();
	}
}
