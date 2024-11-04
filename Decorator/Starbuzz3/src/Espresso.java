/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Espresso extends Beverage {
	Beverage beverage;
	
	public Espresso(String size) {
		description = "Espresso Coffee";
		setSize(size);
	}
	
	public Espresso(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	public String getDescription() {
		if(beverage instanceof Espresso) {
			return beverage.getDescription() + ", Espresso Coffee";
		}
        return description;
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
		
		if(beverage instanceof Espresso) {
			return beverage.cost() + cost;
		}
		return cost;
	}
}
