package Decorator;

public class EtliPizza implements Pizza {
	@Override
	public String açıklama() {
		return "Etli Pizza (10 inç) Maliyeti: 25.00 TL";
	}

	@Override
	public double fiyat() {
		return 25.00;
	}

}
