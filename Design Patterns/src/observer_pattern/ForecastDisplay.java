package observer_pattern;

public class ForecastDisplay implements Observer {
	public void update() {
		System.out.println("Forecast Display Weather Data Changed...");
	}
}

