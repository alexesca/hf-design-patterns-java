import observer_weather_data.CurrentConditionsDisplay;
import observer_weather_data.ForecastDisplay;
import observer_weather_data.HeatIndexDisplay;
import observer_weather_data.StatisticsDisplay;
import observer_weather_data.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
//		weatherData.setMeasurements(82, 40, 29.2f);
//		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
