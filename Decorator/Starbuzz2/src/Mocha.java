/*
 * Autor: Halena Kulmann Duarte
 * Data: 26/03/2024
 * Versão: 26/03/2024
 */


public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		String size = beverage.getSize();
		double cost = 0;
		if(size == "P") {
			cost = .15;
		}
		else if(size == "M") {
			cost = .20;
		}
		else if(size == "G") {
			cost = .25;
		}
		return cost + beverage.cost();
	}
}
