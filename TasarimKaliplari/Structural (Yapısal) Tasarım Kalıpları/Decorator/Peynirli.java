package Decorator;

public class Peynirli extends PizzaDecorator {
	private Pizza pizza;

	public Peynirli(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String açıklama() {
		return pizza.açıklama() + ", Peynirli (2.00 TL)";
	}

	@Override
	public double fiyat() {
		return pizza.fiyat() + 2.00;
	}

}
