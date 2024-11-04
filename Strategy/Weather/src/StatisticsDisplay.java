/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Display das Estatísticas de Temperatura (min, max, avg) */

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
	// informações para realizar o cálculo de max, min e média da temperatura em relação às atualizações
	private List<Float> temperatureList = new ArrayList<>();
    private float minTemperature = Float.MAX_VALUE;
    private float maxTemperature = Float.MIN_VALUE;
    private float sumTemperature = 0;
    private int measurementsCount = 0;
	
    // printa as informações que competem ao display
	public void display() {
		System.out.println("Temperature - Min: " + minTemperature + ", Max: " + maxTemperature + ", Avg: " + (sumTemperature / measurementsCount));
	}
	
	// adiciona o display como um observer do subject (WeatherData)
	public StatisticsDisplay(Subject subject) {
		subject.registerObserver(this);
	}
	
	// atualiza os atributos com as novas informações e as mostra
	public void update(float temperature, float humidity, float pressure) {
		temperatureList.add(temperature);
	    
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        sumTemperature += temperature;
        measurementsCount++;
	  
	    display();
	}
}
