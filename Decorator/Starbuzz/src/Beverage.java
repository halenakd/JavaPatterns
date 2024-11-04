/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public abstract class Beverage {
	String description = "Unknown beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
