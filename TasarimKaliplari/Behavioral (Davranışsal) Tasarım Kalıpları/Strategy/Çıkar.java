package Strategy;

public class Çıkar implements Strategy {
	@Override
	public int işlemYap(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

}
