package observer_weather_data;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
