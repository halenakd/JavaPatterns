/*
 * Autor: Halena Kulmann Duarte
 * Data: 22/03/2024
 * Versão: 22/03/2024
 */

/* Interface Observer, que vai ser implementada pelas classes de Display */

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
