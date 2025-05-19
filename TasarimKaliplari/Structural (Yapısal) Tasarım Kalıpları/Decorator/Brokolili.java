package Decorator;

public class Brokolili extends PizzaDecorator {
	private Pizza pizza;

	public Brokolili(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String açıklama() {
		return pizza.açıklama() + ", Brokolili (3.00 TL)";
	}

	@Override
	public double fiyat() {
		return pizza.fiyat() + 3.00;
	}

}
