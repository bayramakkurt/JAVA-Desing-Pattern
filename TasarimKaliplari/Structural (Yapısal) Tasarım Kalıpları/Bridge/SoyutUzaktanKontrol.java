package Bridge;

public abstract class SoyutUzaktanKontrol {
	private TV tv;

	public SoyutUzaktanKontrol(TV tv) {
		this.tv = tv;
	}

	public void ac() {
		tv.ac();
	}

	public void kapat() {
		tv.kapat();
	}

	public void kanalDeğiştir(int kanal) {
		tv.kanalDeğiştir(kanal);
	}
}
