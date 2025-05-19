package Decorator;

public abstract class PizzaDecorator implements Pizza {

	@Override
	public String açıklama() {
		return "Malzemeler";
	}

}
