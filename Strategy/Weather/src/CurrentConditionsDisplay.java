/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Display das Condições de Tempo Atuais */

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	
	// printa as informações que competem ao display
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
	
	// adiciona o display como um observer do subject (WeatherData)
	public CurrentConditionsDisplay(Subject subject) {
		subject.registerObserver(this);
	}
	
	// atualiza os atributos com as novas informações e as mostra
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
	    this.humidity = humidity;
	    display();
	}
}