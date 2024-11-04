/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	public double cost() {
		double cost = 0;
		if(size == "P") {
			cost = .90;
		}
		else if(size == "M") {
			cost = .99;
		}
		else if(size == "G") {
			cost = 1.08;
		}
		return cost;
	}
}
