package Bridge;

public class SamsungTV implements TV {
	@Override
	public void ac() {
		System.out.println("Samsung TV açıldı.");
	}

	@Override
	public void kapat() {
		System.out.println("Samsung TV kapatıldı.");
	}

	@Override
	public void kanalDeğiştir(int kanal) {
		System.out.println("Samsung TV " + kanal + " kanala geçildi.");
	}

}
