/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class DarkRoast extends Beverage {
	Beverage beverage;
	
	public DarkRoast(String size) {
		description = "Dark Roast Coffee";
		setSize(size);
	}
	
	public DarkRoast(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	public String getDescription() {
		if(beverage instanceof Espresso) {
			return beverage.getDescription() + ", Dark Roast Coffee";
		}
        return description;
    }
	
	public double cost() {
		double cost = 0;
		
		if(size == "P") {
			cost = 0.90;
		}
		else if(size == "M") {
			cost = 0.99;
		}
		else if(size == "G") {
			cost = 1.08;
		}
		if(beverage instanceof DarkRoast) {
			return beverage.cost() + cost;
		}
		return cost;
	}
}
