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
	
	public double cost() {
		return .15 + beverage.cost();
	}
}
