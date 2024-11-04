
public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso("P");
		beverage = new Espresso(beverage);
		System.out.println(beverage.getDescription() + " $" + Math.round(beverage.cost() * 100.0) / 100.0);
		
		Beverage beverage2 = new DarkRoast("M");
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + Math.round(beverage2.cost() * 100.0) / 100.0);

		Beverage beverage3 = new HouseBlend("M");
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + Math.round(beverage3.cost() * 100.0) / 100.0);
	
		Beverage beverage4 = new HouseBlend("G");
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		/* arredondando o número, pois estava com algum erro de arredondamento */
		System.out.println(beverage4.getDescription() + " $" + Math.round(beverage4.cost() * 100.0) / 100.0);
	}
	
}
