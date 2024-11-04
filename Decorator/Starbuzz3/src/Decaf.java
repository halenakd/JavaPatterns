/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Decaf extends Beverage {
	Beverage beverage;
	
	public Decaf(String size) {
		description = "Decaf Coffee";
		setSize(size);
	}
	
	public Decaf(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	public String getDescription() {
		if(beverage instanceof Espresso) {
			return beverage.getDescription() + ", Decaf Coffee";
		}
        return description;
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
		if(beverage instanceof Decaf) {
			return beverage.cost() + cost;
		}
		return cost;
	}
}
