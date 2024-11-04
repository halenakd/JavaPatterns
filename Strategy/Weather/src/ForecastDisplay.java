/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Display da Previsão do Tempo conforme o barômetro */

public class ForecastDisplay implements Observer, DisplayElement {
	private float pressure;
	
	// printa as informações que competem ao display
	public void display() {
		System.out.println("Weather forecast based on barometer: " + getForecast());
	}
	
	// adiciona o display como um observer do subject (WeatherData)
	public ForecastDisplay(Subject subject) {
		subject.registerObserver(this);
	}
	
	// atualiza os atributos com as novas informações e as mostra
	public void update(float temperature, float humidity, float pressure) {
	    this.pressure = pressure;
	    display();
	}
	
	// dependendo da pressão, o tempo será chuvoso, nublado ou limpo
	private String getForecast() {
        if (pressure < 100) {
            return "Expect stormy weather.";
        } else if (pressure < 120) {
            return "Expect cloudy weather with possible rain.";
        } else {
            return "Expect clear weather.";
        }
    }
}
