/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */

public abstract class Beverage {
	String description = "Unknown beverage";
	String size = "Unknown size";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
}
