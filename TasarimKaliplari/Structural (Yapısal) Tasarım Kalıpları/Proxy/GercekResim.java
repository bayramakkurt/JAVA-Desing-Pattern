package Proxy;

public class GercekResim implements Resim {
	private String dosyaAdi;

	public GercekResim(String dosyaAdi) {
		this.dosyaAdi = dosyaAdi;
		// Diskten resmi yükle
		yukle(dosyaAdi);
	}

	private void yukle(String dosyaAdi) {
		System.out.println(dosyaAdi + " yükleniyor...");
	}
	@Override
	public void goruntule() {
		System.out.println(dosyaAdi + " görüntüleniyor.");
	}

}
