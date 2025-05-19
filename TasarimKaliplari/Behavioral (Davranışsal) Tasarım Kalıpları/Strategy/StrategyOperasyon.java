package Strategy;

public class StrategyOperasyon {
	private Strategy strategy;
	
	public StrategyOperasyon(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int strategyYap(int sayi1, int sayi2) {
		return strategy.işlemYap(sayi1, sayi2);
	}

}
