package Proxy;

public class ProxyResim implements Resim {
	private String dosyaAdi;
	private GercekResim gercekResim;

	public ProxyResim(String dosyaAdi) {
		this.dosyaAdi = dosyaAdi;
	}

	@Override
	public void goruntule() {
		if (gercekResim == null) {
			gercekResim = new GercekResim(dosyaAdi);
		}
		gercekResim.goruntule();
	}

}
