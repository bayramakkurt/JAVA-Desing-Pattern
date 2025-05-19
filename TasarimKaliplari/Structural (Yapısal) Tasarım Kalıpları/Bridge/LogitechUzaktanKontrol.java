package Bridge;

public class LogitechUzaktanKontrol extends SoyutUzaktanKontrol {
	public LogitechUzaktanKontrol(TV tv) {
		super(tv);
	}

	public void KanalDeğiştir(int kanal) {
		System.out.println("Logitech uzaktan kumanda ile kanal değiştirildi.");
		kanalDeğiştir(kanal);
	}

}
