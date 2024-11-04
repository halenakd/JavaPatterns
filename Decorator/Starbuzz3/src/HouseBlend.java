/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class HouseBlend extends Beverage {
	Beverage beverage;
	
	public HouseBlend(String size) {
		description = "House Blend Coffee";
		setSize(size);
	}
	
	public HouseBlend(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	public String getDescription() {
		if(beverage instanceof Espresso) {
			return beverage.getDescription() + ", House Blend Coffee";
		}
        return description;
    }
	
	public double cost() {
		double cost = 0;
		
		if(size == "P") {
			cost = 0.84;
		}
		else if(size == "M") {
			cost = 0.89;
		}
		else if(size == "G") {
			cost = 0.94;
		}
		
		if(beverage instanceof HouseBlend) {
			return beverage.cost() + cost;
		}
		return cost;
	}
}
