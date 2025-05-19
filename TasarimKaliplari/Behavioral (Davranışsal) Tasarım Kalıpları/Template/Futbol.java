package Template;

public class Futbol extends Oyun {

	@Override
	void oyunBitir() {
		System.out.println("Futbol oyunu bitti.");
	}

	@Override
	void oyunKur() {
		System.out.println("Futbol oyunu kuruldu.");
	}

	@Override
	void oyunBaşlat() {
		System.out.println("Futbol oyunu başlatıldı.");
	}

}
