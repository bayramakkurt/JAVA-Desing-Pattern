package Observer;

public class Kullanıcı implements Observer {
	private String isim;

	public Kullanıcı(String isim) {
		this.isim = isim;
	}

	@Override
	public void guncelle(String mesaj) {
		System.out.println(isim + " kullanıcısı, güncelleme aldı: " + mesaj);
	}
}
