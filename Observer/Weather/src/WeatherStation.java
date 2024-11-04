/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Simulação de Estação de Tempo */

public class WeatherStation {
	public static void main(String[] args) {
		// dados do tempo
		WeatherData weatherData = new WeatherData();
		
		// instanciando cada display
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay staticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		// atualização dos dados de tempo, no subject
		// serão notificados para os observers (displays)
		// eles vão se atualizar e mostrar as novas informações
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
