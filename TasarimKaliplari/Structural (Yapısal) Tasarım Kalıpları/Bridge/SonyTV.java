package Bridge;

public class SonyTV implements TV {
	@Override
	public void ac() {
		System.out.println("Sony TV açıldı.");
	}

	@Override
	public void kapat() {
		System.out.println("Sony TV kapatıldı.");
	}

	@Override
	public void kanalDeğiştir(int kanal) {
		System.out.println("Sony TV " + kanal + " kanala geçildi.");
	}

}
