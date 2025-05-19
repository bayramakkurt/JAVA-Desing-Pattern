package Adapter;

public class YazıcıAdapter implements Yazıcı {
	private EskiYazıcı eskiYazıcı;

	public YazıcıAdapter() {
		this.eskiYazıcı = new EskiYazıcı();
	}

	@Override
	public void yazdır(String metin) {
		eskiYazıcı.belgeYazdır(metin);
	}

}
