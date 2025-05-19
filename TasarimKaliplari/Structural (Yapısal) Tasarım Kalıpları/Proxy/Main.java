package Proxy;

public class Main {

	public static void main(String[] args) {
		Resim resim1 = new ProxyResim("resim1.jpg");

		resim1.goruntule(); // İlk kez görüntülendiğinde gerçek resmi yükler
		resim1.goruntule(); // Daha sonra sadece görüntüler

	}

}
