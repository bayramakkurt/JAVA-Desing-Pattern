package Decorator;

public class Main {
	public static void main(String[] args) {
		Pizza pizza = new VejeteryanPizza();
		
		pizza = new Peynirli(pizza);
		pizza = new Brokolili(pizza);
		
		System.out.println("Pizza Açıklaması: " + pizza.açıklama());
		System.out.println("Pizza Fiyatı: " + pizza.fiyat() + " TL");
		
		Pizza pizza2 = new EtliPizza();
		
		pizza2 = new Peynirli(pizza2);
		pizza2 = new Brokolili(pizza2);
		
		System.out.println("Pizza Açıklaması: " + pizza2.açıklama());
		System.out.println("Pizza Fiyatı: " + pizza2.fiyat() + " TL");
		
	}

}
