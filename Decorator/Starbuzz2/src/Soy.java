/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		String size = beverage.getSize();
		double cost = 0;
		if(size == "P") {
			cost = .10;
		}
		else if(size == "M") {
			cost = .15;
		}
		else if(size == "G") {
			cost = .20;
		}
		return cost + beverage.cost();
	}
}
