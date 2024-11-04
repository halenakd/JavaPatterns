/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso Coffee";
	}
	
	public double cost() {
		double cost = 0;
		if(size == "P") {
			cost = 1.80;
		}
		else if(size == "M") {
			cost = 1.99;
		}
		else if(size == "G") {
			cost = 2.15;
		}
		return cost;
	}
}
