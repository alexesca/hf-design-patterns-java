package observer_pattern;

public class StatisticsDisplay implements Observer {
	public void update() {
		System.out.println("Statistics Display Weather Data Changed...");
	}
}
