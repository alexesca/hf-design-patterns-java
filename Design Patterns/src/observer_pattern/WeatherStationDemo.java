package observer_pattern;

public class WeatherStationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		Observer currentConditionDisplay = new CurrentConditionDisplay();
		Observer statisticsDisplay = new StatisticsDisplay();
		Observer forecastDisplay = new ForecastDisplay();
		
		// Add subscribers
		weatherData.registerObserver(currentConditionDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(forecastDisplay);
		
		System.out.println("\n***** Notifying all observers about data changes... ****\n");
		
		// Notify all observers about a change in the data
		weatherData.notifyObservers();
		
	}

}