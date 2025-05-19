package Adapter;

public class Main {

	public static void main(String[] args) {
		Yazıcı yazıcı = new YazıcıAdapter();
		yazıcı.yazdır("Merhaba, dünya!");

		// Eski yazıcıyı doğrudan kullanma
		EskiYazıcı eskiYazıcı = new EskiYazıcı();
		eskiYazıcı.belgeYazdır("Merhaba, dünya!");

		// Adapter kullanarak eski yazıcıyı modern bir arayüzle kullanma
		YazıcıAdapter adapter = new YazıcıAdapter();
		adapter.yazdır("Merhaba, dünya!");

		System.out.println("Yazdırma işlemi tamamlandı.");
	}

}
