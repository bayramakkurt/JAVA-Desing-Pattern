package Strategy;

public class Main {

	public static void main(String[] args) {
		StrategyOperasyon operation = new StrategyOperasyon(new Ekle());
		System.out.println("Toplama: " + operation.strategyYap(5, 3));
		
		operation = new StrategyOperasyon(new Çarp());
		System.out.println("Çarpma: " + operation.strategyYap(5, 3));
		
		operation = new StrategyOperasyon(new Çıkar());
		System.out.println("Çıkarma: " + operation.strategyYap(5, 3));

	}

}
