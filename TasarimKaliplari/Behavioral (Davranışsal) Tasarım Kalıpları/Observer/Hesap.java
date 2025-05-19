package Observer;

public class Hesap extends Konu {
	private String hesapIsmi;

	public Hesap(String hesapIsmi) {
		this.hesapIsmi = hesapIsmi;
	}
	
	public void paylasımYap(String mesaj) {
		System.out.println(hesapIsmi + " hesabı paylaşım yaptı: " + mesaj);
		gözlemcileriBilgilendir(mesaj);
	}

}
