package observer_pattern;

public class CurrentConditionDisplay implements Observer {
	public void update() {
		System.out.println("Current Condition Display Weather Data Changed...");
	}
}
