/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Dados do Tempo */

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	// lista de seus observers
	private List<Observer> observers = new ArrayList<>();
	
	// condições
	private float temperature;
	private float humidity;
	private float pressure;
	
	// funções para adicionar, remover e notificar cada observador com os dados atualizados
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
	}
	
	// toda vez que seus atributos são setados, os observers são notificados
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
	
	// funções de retorno de cada atributo, não foram utilizadas :(
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
