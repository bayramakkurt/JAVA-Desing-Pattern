package Observer;

public class Main {
	
	public static void main(String[] args) {
		Hesap hesap = new Hesap("Yazılım Dünyası");

		Kullanıcı kullanıcı1 = new Kullanıcı("Ali");
		Kullanıcı kullanıcı2 = new Kullanıcı("Ayşe");

		hesap.gözlemciEkle(kullanıcı1);
		hesap.gözlemciEkle(kullanıcı2);

		hesap.paylasımYap("Yeni bir ürün geldi!");

		hesap.gözlemciKaldır(kullanıcı1);

		hesap.paylasımYap("İndirim başladı!");
	}
}
