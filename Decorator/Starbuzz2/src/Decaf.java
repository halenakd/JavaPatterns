/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
	
	public double cost() {
		double cost = 0;
		if(size == "P") {
			cost = 0.97;
		}
		else if(size == "M") {
			cost = 1.05;
		}
		else if(size == "G") {
			cost = 1.17;
		}
		return cost;
	}
}
