/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		String size = beverage.getSize();
		double cost = 0;
		if(size == "P") {
			cost = .5;
		}
		else if(size == "M") {
			cost = .10;
		}
		else if(size == "G") {
			cost = .15;
		}
		return cost + beverage.cost();
	}
}
