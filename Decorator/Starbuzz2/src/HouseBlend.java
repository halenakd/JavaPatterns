/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		double cost = 0;
		if(size == "P") {
			cost = .84;
		}
		else if(size == "M") {
			cost = .89;
		}
		else if(size == "G") {
			cost = .94;
		}
		return cost;
	}
}
