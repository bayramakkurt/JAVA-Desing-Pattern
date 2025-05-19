package Decorator;

public class VejeteryanPizza implements Pizza {
	@Override
	public String açıklama() {
		return "Vejeteryan Pizza (10 inç) Maliyeti: 20.00 TL";
	}

	@Override
	public double fiyat() {
		return 20.00;
	}

}
